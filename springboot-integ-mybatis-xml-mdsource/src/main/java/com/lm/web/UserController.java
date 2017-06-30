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
 * @date   2017年6月30日
 *
 */
@RestController
public class UserController {

    @Autowired
    private User1Mapper user1Mapper;

	@Autowired
	private User2Mapper user2Mapper;
	
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=user1Mapper.getAll();
		return users;
	}
	
	@RequestMapping("/getAllUserSize")
	public String getAllUserSize() {
		int test1UserSize = user1Mapper.getAll().size();
		int test2UserSize = user2Mapper.getAll().size();
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("test1UserSize:").append(test1UserSize)
		.append( " + ")
		.append("test2UserSize:").append(test2UserSize)
		.append(" = ").append(test1UserSize+test2UserSize);
		return sBuilder.toString();
	}
	
	@RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
    	UserEntity user=user2Mapper.getUserById(id);
        return user;
    }
    
    @RequestMapping("/add")
    public void save(UserEntity user) {
        user2Mapper.insert(user);
    }
    
    @RequestMapping(value="update")
    public void update(UserEntity user) {
        user2Mapper.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }
    
    
}