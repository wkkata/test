package org.kjmx.praycards.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.kjmx.praycards.constants.EntityConstant;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class AbstractDao<T> extends HibernateDaoSupport implements IDao<T>  {
	
	private Class<T> entityClass; 
	
	private Logger logger = LogManager.getLogger(getClass());
	
	/**
	 * 如果此属性存在， 那么删除将不彻底删除该条记录，而是采取注销形式
	 */
	private String stateStr = null;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}


	public T get(Serializable Id) {
		return this.getHibernateTemplate().get(entityClass, Id);
	}
	
	public Object save(T obj) {
		return this.getHibernateTemplate().save(obj);
	}


	public void delete(T obj) {
		this.getHibernateTemplate().delete(obj);
	}


	public void update(T obj) {
		this.getHibernateTemplate().update(obj);
	}


	public boolean isExist(String whereString, Object... objects) {
		
		return !this.getHibernateTemplate().find("from " + entityClass.getSimpleName() + " as obj where 1=1 " + whereString, objects).isEmpty();
	}
	
	@SuppressWarnings("unchecked")
	public T findObject(String whereString, Object... objects) {
		try{
			if(this.getStateStr() == null)
				return (T)this.getHibernateTemplate().find("from " + entityClass.getSimpleName() + " as obj where 1=1 " + whereString, objects).get(0);
			else
				return (T)this.getHibernateTemplate().find("from " + entityClass.getSimpleName() + " as obj where 1=1 and obj." + this.getStateStr() + "!=? "+ whereString, EntityConstant.CANCELED, objects).get(0);
		}catch (IndexOutOfBoundsException e) {
			logger.error("发生 findObject 错误", e);
			return null;
		}
	}


	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}


	public String getStateStr() {
		return stateStr;
	}
}
