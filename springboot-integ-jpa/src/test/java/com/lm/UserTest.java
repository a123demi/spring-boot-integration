package com.lm;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.entity.User;
import com.lm.service.UserService;

public class UserTest  extends AppTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void selectPost(){
		List<User> users = userService.selectPost("11", "11");
		
		Assert.assertNotNull(users);
	}
	
	@Test
	public void selectPut(){
		User user = userService.selectPut(3, "22", "22");
		
		Assert.assertNotNull(user);
	}
	
	@Test
	public void selectUsernameNot(){
		List<User> users = userService.selectUserNot("11");
		
		Assert.assertNotNull(users);
	}
	
}