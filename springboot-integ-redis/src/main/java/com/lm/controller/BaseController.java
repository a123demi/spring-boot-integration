package com.lm.controller;

import org.springframework.ui.ModelMap;

/**
 * 
 * @author liangming.deng
 * @date   2017年11月17日
 *
 */
public class BaseController {

	/**
	 * 接口返回通用规范
	 * @param code
	 * @param msg
	 * @param data
	 * @return
	 */
	public ModelMap result(String code, String msg, Object data) {
		ModelMap modelMap = new ModelMap();
		modelMap.put("code", code);
		modelMap.put("msg", msg);
		modelMap.put("result", data);
		return modelMap;
	}
}
