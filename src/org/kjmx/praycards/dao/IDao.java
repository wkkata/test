package org.kjmx.praycards.dao;

import java.io.Serializable;

public interface IDao<T> {
	
	/**
	 * ������������ʵ��
	 * @param Id ����
	 * @return ʵ��
	 */
	T get(Serializable Id);
	
	/**
	 * ����ʵ��
	 * @param obj ʵ��
	 * @return ����ֵ
	 */
	Object save(T obj);
	
	/**
	 * �޸�ʵ��
	 * @param obj ʵ��
	 */
	void update(T obj);
	
	/**
	 * ɾ��ʵ��
	 * @param obj ʵ��
	 */
	void delete(T obj);
	
	/**
	 * �Ƿ����ĳ��ʵ��
	 * @param whereString ��ѯ�ַ���, ��and ��ͷ�� objΪ����ǰ׺��? Ԥ����
	 * @param objects ��������
	 * @return ����
	 */
	boolean isExist(String whereString, Object... objects);
	
	/**
	 * ���ղ�ѯ������ȡʵ��
	 * @param whereString ��ѯ�ַ���, ��and ��ͷ�� objΪ����ǰ׺��? Ԥ����
	 * @param objects ��������
	 * @return
	 */
	T findObject(String whereString, Object...objects);
}
