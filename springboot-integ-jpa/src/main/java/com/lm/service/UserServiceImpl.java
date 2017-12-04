package com.lm.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.entity.User;
import com.lm.repository.UserRepository;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月20日
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;


	public List<User> selectAll() {
		return userRepository.findAll();
	}

	@Override
	public User selectOne(Integer id) {
		return userRepository.findOne(id);
	}

	@Override
	public void selectDelete(Integer id) {
		userRepository.delete(id);
	}

	@Override
	public List<User> selectPost(String username, String password) {
		User user = new User(username, password, username, new Date(), username, new Date());
		List<User> users = new ArrayList<>();
		users.add(user);
		userRepository.save(users);
		return users;
	}

	@Override
	public User selectPut(Integer id,String username, String password) {
		User user = userRepository.getOne(id);
		if(user == null){
			return user;
		}
		user.setPassword(password);
		user.setUsername(username);
		userRepository.save(user);
		return user;
	}

	@Override
	public List<User> selectUserNot(String username) {
		
		return userRepository.findByUsernameNot(username);
	}
}
