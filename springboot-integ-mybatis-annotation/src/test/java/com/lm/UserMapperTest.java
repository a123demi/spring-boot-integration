package com.lm;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.entity.UserEntity;
import com.lm.mapper.UserMapper;

public class UserMapperTest extends AppTest {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void testGetAlls(){
		List<UserEntity> users = userMapper.getAll();
		System.out.println(users.toString());
	}
	
	@Test
	public void testGetUserById(){
		UserEntity user = userMapper.getUserById(15L);
		System.out.println(user.toString());
	}
	
	@Test
	public void testDelete(){
		userMapper.delete(16L);
		UserEntity user = userMapper.getUserById(16L);
		System.out.println(user.toString());
	}
	
	
	@Test
	public void testUpdate(){
		UserEntity user = new UserEntity();
		user.setId(15L);
		user.setNickName("dlm123");
		user.setUserName("123");
		userMapper.update(user);
		UserEntity user1 = userMapper.getUserById(15L);
		System.out.println(user1.toString());
	}
}
