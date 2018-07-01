package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("d3")
public class D3Controller {
	
	
	@RequestMapping("getJson")
	@ResponseBody
	public JSONObject getJson() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", 1);
		jsonObject.put("message", "成功");
		return jsonObject;
	}
}
