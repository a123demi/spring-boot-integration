package com.lm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.entity.User;
import com.lm.service.UserService;
import com.lm.util.Constant;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月17日
 *
 */
@RestController
@RequestMapping("/user")

public class UserController extends BaseController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	RedisConnectionFactory redisConnectionFactory;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@Cacheable(value = "search", keyGenerator = "keyGenerator")
	public ModelMap search() {
		List<User> userList = userService.selectAll();
		LOGGER.info("search....");
		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, userList);
	}

	@RequestMapping(value = "/selectOne", method = RequestMethod.POST)
	@Cacheable(value = "search", keyGenerator = "keyGenerator")
	public ModelMap search(@RequestBody User user) {
		getUserIds(user);
		List<User> userList = userService.selectByUsernameAndPassword(user);
		LOGGER.info("search....");
		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, userList);
	}

	private void getUserIds(@RequestBody User user) {
		List<Integer> userIds = new ArrayList<>();
		userIds.add(1);
		userIds.add(2);
		userIds.add(3);
		user.setUserIdList(userIds);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelMap save(String username, String password) {
		User user = new User(username, password, "admin", new Date(), "admin", new Date());
		user = userService.save(user);
		System.out.println(user);
		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, 0);
	}

}
