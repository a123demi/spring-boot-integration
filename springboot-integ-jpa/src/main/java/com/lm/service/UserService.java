package com.lm.service;

import java.util.List;

import com.lm.entity.User;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月20日
 *
 */
public interface UserService {
	/**
	 * 获取所有数据
	 * @return
	 */
	List<User> selectAll();

	/**
	 * 根据id获取数据
	 * @param id
	 * @return
	 */
	User selectOne(Integer id);

	/**
	 * 根据id删除数据
	 * @param id
	 */
	void selectDelete(Integer id);

	/**
	 * 根据条件获取
	 * @param username
	 * @param password
	 * @return
	 */
	List<User> selectPost(String username,String password);

	/**
	 * 根据id获取
	 * @param id
	 * @return
	 */
	User selectPut(Integer id,String username, String password);
	
	/**
	 * 获取不包含username的数据
	 * @param username
	 * @return
	 */
	List<User> selectUserNot(String username);
}
