package com.test.test;

public interface A {
	
	default void test() {
		System.out.println("我是默认方法");
	}
	
	static void stest() {
		System.out.println("我是静态方法");
	}

}
