package com.test.controller;

import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;

@Controller
public class BaseController {
	protected JSONObject jsonParam = new ThreadLocal<JSONObject>().get();
	
	
}
