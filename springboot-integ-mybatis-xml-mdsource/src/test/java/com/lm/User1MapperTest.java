package com.lm;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.entity.UserEntity;
import com.lm.mapper.test1.User1Mapper;

public class User1MapperTest  extends AppTest {

	@Autowired
	private User1Mapper userMapper;


	@Test
	public void testQuery() throws Exception {
		List<UserEntity> users = userMapper.getAll();
		if(users==null || users.size()==0){
			System.out.println("is null");
		}else{
			System.out.println(users.size());
		}
	}
	
	

}