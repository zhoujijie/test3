package com.test.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.test.bean.Test;
import com.test.service.TestService;

@Controller
public class MyController extends BaseController{
	
	@Autowired
	private TestService testService;
	private int a = 10;
	
	@RequestMapping("/test")
	public String test() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", 1);
		Test test = testService.getTest(map);
		System.out.println(test.getId());
		System.out.println(111);
		return "test";
	}
	
	@RequestMapping("/Httptest")
	@ResponseBody
	public JSONObject Httptest(String name, int age) {
		jsonParam.put("b", 2);
		System.out.println(a);
		a = 100;
		System.out.println(a);
		User u = new User();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", u.getName());
		jsonObject.put("msg", "成功");
		System.out.println("Httptest");
		jsonObject.put("date", new Date());
		return jsonObject;
	}
	
	@RequestMapping(value="/Httptest1")
	@ResponseBody
	public String Httptest1(@RequestBody JSONObject name) {
		System.out.println(name);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", 1);
		jsonObject.put("msg", "成功");
		return "中文测试";
	}
}
