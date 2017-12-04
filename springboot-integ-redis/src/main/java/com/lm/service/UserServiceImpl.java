package com.lm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.entity.User;
import com.lm.repository.UserRepository;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月17日
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
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> selectByUsernameAndPassword(User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

	@Override
	public User selectByPrimaryKey(int id) {
		return userRepository.findOne(id);
	}
}
