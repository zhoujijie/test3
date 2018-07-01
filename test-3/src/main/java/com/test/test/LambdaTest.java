package com.test.test;

import java.util.function.BiConsumer;

public class LambdaTest {
	
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("突破");
		runnable.run();
		
		BiConsumer<Integer,Integer> biConsumer = (a,b) -> {
			System.out.println("突破:"+ a + b);
		};
		biConsumer.accept(1, 1);
		
	}

}
