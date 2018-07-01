package com.test.test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class ThreadTest implements Runnable{
	
	public JSONObject jsonObject = new JSONObject();
	Map<String,Object> mapTest = new HashMap<String,Object>();
	
	public void test() {
		
	}


	@Override
	public void run() {
		mapTest.put("a", "测试");
		mapTest.clear();
		mapTest.put("b", "bb");
		jsonObject.put("a", "测试");
		jsonObject.clear();
		jsonObject.put("b", "bb");
		System.out.println(Thread.currentThread().getName()+"     "+jsonObject);
	}
	
	
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		for (int j=0;j<250;j++) {
			for (int i=0;i<25;i++) {
				new Thread(t).start();
			}
			System.out.println("--------------------");
		}
		
	}
}
