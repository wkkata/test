package org.kjmx.praycards.manager;

/**
 * ҵ���߼���  ����߽ӿڶ���
 * @author wkkata
 *
 */
public interface IService<T> {
	
	/**
	 * ����
	 * @param object
	 * @return
	 */
	boolean save(T object);
	
	/**
	 * ����ĳ������
	 * @param object
	 * @return
	 */
	boolean update(T object);
	
	/**
	 * ɾ��ĳ������
	 * @param object
	 * @return
	 */
	boolean delete(T object);
	
}
