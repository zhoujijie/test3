package com.test.controller;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

/**
 */
@Component("Test")
public class Test extends AbstractTest{
	
	private static JSONObject json = new JSONObject();
	
	
	public void test(JSONObject json) {
		json.put("a", "123");
		System.out.println(json);
		json.clear();   
		System.out.println(json);
	}
	
	public static void main(String[] args) {
//		Test t = new Test();
//		t.test(json);
		ThreadLocal<JSONObject> jsonThread = new ThreadLocal();
		jsonThread.set(new JSONObject());
	}
}
