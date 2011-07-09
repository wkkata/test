package org.kjmx.praycards.manager;

/**
 * 业务逻辑层  ，最高接口定义
 * @author wkkata
 *
 */
public interface IService<T> {
	
	/**
	 * 保存
	 * @param object
	 * @return
	 */
	boolean save(T object);
	
	/**
	 * 更新某个对象
	 * @param object
	 * @return
	 */
	boolean update(T object);
	
	/**
	 * 删除某个对象
	 * @param object
	 * @return
	 */
	boolean delete(T object);
	
}
