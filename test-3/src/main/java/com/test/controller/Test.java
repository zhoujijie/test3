package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	@RequestMapping("test")
	public void test() {
		System.out.println(111);
		System.out.println("你个大煞笔");
	}

}