package com.test.test;

import java.util.Optional;

public class TestAnnotationAspect {

	public void getName(User user) {
//		Optional.ofNullable(user).ifPresent(lambdaUser -> {
//			System.out.println(lambdaUser.getName());
//			System.out.println(22);
//		});
//		
		String a = Optional.ofNullable(user).map(User::getName).orElse("no name");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		TestAnnotationAspect Test1 = new TestAnnotationAspect();
//		User user = new User();
		User user = new User("张三");
		Test1.getName(user);
	}
}
