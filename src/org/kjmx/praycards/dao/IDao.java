package org.kjmx.praycards.dao;

import java.io.Serializable;

public interface IDao<T> {
	
	/**
	 * 根据主键查找实体
	 * @param Id 主键
	 * @return 实体
	 */
	T get(Serializable Id);
	
	/**
	 * 保存实体
	 * @param obj 实体
	 * @return 主键值
	 */
	Object save(T obj);
	
	/**
	 * 修改实体
	 * @param obj 实体
	 */
	void update(T obj);
	
	/**
	 * 删除实体
	 * @param obj 实体
	 */
	void delete(T obj);
	
	/**
	 * 是否存在某个实体
	 * @param whereString 查询字符串, 以and 开头， obj为参数前缀，? 预编译
	 * @param objects 参数设置
	 * @return 真或假
	 */
	boolean isExist(String whereString, Object... objects);
	
	/**
	 * 按照查询条件获取实体
	 * @param whereString 查询字符串, 以and 开头， obj为参数前缀，? 预编译
	 * @param objects 参数设置
	 * @return
	 */
	T findObject(String whereString, Object...objects);
}
