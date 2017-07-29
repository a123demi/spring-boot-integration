package com.lm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.entity.UserEntity;
import com.lm.mapper.test1.User1Mapper;
import com.lm.mapper.test2.User2Mapper;
/**
 * 前端控制器
 * @author liangming.deng
 * @date   2017年6月21日
 *
 */
@RestController
public class UserController {

	@Autowired
	private User2Mapper user2Mapper;

	@Autowired
	private User1Mapper user1Mapper;
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users = user2Mapper.getAll();
		return users;
	}
	
	@RequestMapping("/getAllUserCount")
	public String getAllUserCount(){
		int user1Count = user1Mapper.getAll().size();
		int user2Count = user2Mapper.getAll().size();
		
		return "user1Count:" + user1Count + " add " + "user2Count:" + user2Count + " = " + (user1Count+user2Count); 
	}

	@RequestMapping("/getUser")
	public UserEntity getUser(Long id) {
		UserEntity user = user2Mapper.getUserById(id);
		return user;
	}

	@RequestMapping("/add")
	public void save(UserEntity user) {
		user2Mapper.insert(user);
	}

	@RequestMapping(value = "update")
	public void update(UserEntity user) {
		user2Mapper.update(user);
	}

	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		user2Mapper.delete(id);
	}

}