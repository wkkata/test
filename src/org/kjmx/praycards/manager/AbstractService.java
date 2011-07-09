/**
 * 
 */
package org.kjmx.praycards.manager;

import org.kjmx.praycards.dao.IDao;

/**
 * 最高抽象类
 * @author wkkata
 *
 */
public abstract class AbstractService<T> implements IService<T> {
	
	private IDao<T> dao;

	public void setDao(IDao<T> dao) {
		this.dao = dao;
	}

	protected IDao<T> getDao() {
		return dao;
	}
	
	public boolean save(T object) {
		
		if(dao.save(object) != null) return true;
		
		return false;
	}
	
	public boolean delete(T object) {
		
		dao.delete(object);
		
		return true;
	};
	
	public boolean update(T object) {
		
		dao.update(object);
		
		return true;
	};
}
