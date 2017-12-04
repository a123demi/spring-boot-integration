package com.lm.service;


import java.util.List;

import com.lm.entity.User;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月17日
 *
 */
public interface UserService {
	List<User> selectAll();

	User save(User user);

	List<User> selectByUsernameAndPassword(User user);


	User selectByPrimaryKey(int id);
}
