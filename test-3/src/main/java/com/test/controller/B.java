package com.test.controller;

/**
 * 
 * @author Administrator
 * {@link A}
 */
public interface B {

	default void test() {
		System.out.println("我是B默认方法");
	}
	
	static void stest() {
		System.out.println("我是B静态方法");
	}
}
