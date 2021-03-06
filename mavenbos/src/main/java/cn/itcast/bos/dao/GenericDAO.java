package cn.itcast.bos.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/**
 * 通用 DAO 设计接口
 * 
 * @author seawind
 * 
 */
public interface GenericDAO<T> {

	/**
	 * 保存
	 * 
	 * @param obj
	 */
	public void save(T obj);

	/**
	 * 修改
	 * 
	 * @param obj
	 */
	public void update(T obj);

	/**
	 * 删除
	 * 
	 * @param obj
	 */
	public void delete(T obj);

	/**
	 * 根据id 查询
	 * 
	 * @param id
	 * @return
	 */
	public T findById(Serializable id);

	/**
	 * 查询 所有数据
	 * 
	 * @return
	 */
	public List<T> findAll();

	/**
	 * 条件查询
	 */
	public List<T> findByNamedQuery(String queryName, Object... values); // 根据hql 查询

	public List<T> findByCriteria(DetachedCriteria detachedCriteria); // 面向对象条件查询
}
