package com.lm;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.entity.UserEntity;
import com.lm.enums.SexEnums;
import com.lm.mapper.UserMapper;



public class UserMapperTest extends AppTest {
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testInsert() throws Exception {
		userMapper.insert(new UserEntity("aa", "aa","a123456",new Date(),"aa@126.com", SexEnums.MAN));
		userMapper.insert(new UserEntity("bb", "bb","a123456",new Date(),"bb@126.com", SexEnums.MAN));
		userMapper.insert(new UserEntity("cc", "cc","a123456",new Date(),"cc@126.com", SexEnums.WOMAN));

		Assert.assertNotNull(userMapper.getAll().size());
	}

	@Test
	public void testQuery() throws Exception {
		List<UserEntity> users = userMapper.getAll();
		if(users==null || users.size()==0){
			System.out.println("is null");
		}else{
			System.out.println(users.toString());
		}
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		UserEntity user = userMapper.getUserById(15L);
		System.out.println(user.toString());
		user.setUserName("dd");
		userMapper.update(user);
		Assert.assertTrue(("dd".equals(userMapper.getUserById(15L).getUserName())));
	}

}
