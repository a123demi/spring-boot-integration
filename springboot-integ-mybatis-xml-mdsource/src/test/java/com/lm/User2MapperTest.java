package com.lm;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lm.entity.UserEntity;
import com.lm.mapper.test2.User2Mapper;

public class User2MapperTest extends AppTest {

	@Autowired
	private User2Mapper userMapper;


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