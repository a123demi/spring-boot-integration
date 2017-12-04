package com.lm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.entity.User;
import com.lm.service.UserService;
import com.lm.utils.Constant;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月20日
 *
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	
	@RequestMapping(value = "/selectGet/{id}", method = RequestMethod.GET)
	public ModelMap selectGet(@PathVariable Integer id) {
		User user = userService.selectOne(id);
		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, user);
	}
	
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public ModelMap search() {
		List<User> userList = userService.selectAll();

		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, userList);
	}

	@RequestMapping(value = "/selectPost", method = RequestMethod.POST)
	public ModelMap selectPost(String username, String password) {
		List<User> userList = userService.selectPost(username, password);

		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, userList);
	}

	@RequestMapping(value = "/selectPut", method = RequestMethod.PUT)
	public ModelMap selectPut(Integer id,String username, String password) {
		List<User> userList = userService.selectPost(username, password);

		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, userList);
	}

	@RequestMapping(value = "/selectDelete/{id}", method = RequestMethod.DELETE)
	public ModelMap selectDelete(@PathVariable Integer id) {

		userService.selectDelete(id);

		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, 0);
	}

	@RequestMapping(value = "/selectHead/{id}", method = RequestMethod.HEAD)
	public ModelMap selectHead(@PathVariable Integer id) {
		User user = userService.selectOne(id);
		return result(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, user);
	}

}
