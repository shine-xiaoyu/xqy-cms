package com.xqy.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseDao<T> {
	/**
	 * @Title: select   
	 * @Description: 按条件查询   
	 * @param: @param T
	 * @param: @return      
	 * @return: List<T>      
	 * @throws
	 */
	List<T> select(T t);
	/**
	 * @Title: selectById   
	 * @Description: 根据Id查询   
	 * @param: @param id
	 * @param: @return      
	 * @return: T      
	 * @throws
	 */
	T selectById(Integer id);
	/**
	 * @Title: insert   
	 * @Description: 新增   
	 * @param: @param t
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(T t);
	/**
	 * @Title: update   
	 * @Description: 修改   
	 * @param: @param t
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(T t);
	/**
	 * @Title: delete   
	 * @Description: 删除   
	 * @param: @param ids
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int delete(@Param("ids") String ids);
}
