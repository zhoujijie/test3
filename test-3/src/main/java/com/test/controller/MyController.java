package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
public class MyController {
	
	@RequestMapping("/test")
	public String test() {
		System.out.println(111);
		return "test";
	}
	
	@RequestMapping("/Httptest")
	@ResponseBody
	public String Httptest() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", 1);
		jsonObject.put("msg", "成功");
		System.out.println("Httptest");
		return jsonObject.toJSONString();
	}
	
	@RequestMapping(value="/Httptest1", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String Httptest1(String name) {
		System.out.println(name);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", 1);
		jsonObject.put("msg", "成功");
		System.out.println("Httptest");
		return "中文测试";
	}
}
