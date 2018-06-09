package com.test.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

@Component
@Aspect
public class TestAspect {

	
	@Before("execution(* com.test.controller.Test.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs().length);
    }
	
	@Around("@annotation(com.test.controller.TestAnnotation)")
	public String aroundMethod(ProceedingJoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		JSONObject j = new JSONObject();
		j.put("aa", "我成功了");
		try {
			Object proceed = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕后置通知");
		return j.toJSONString();
	}
	
//	----------------------测试配合注解---------------------
	
	/*@Pointcut("@annotation(com.test.controller.TestAnnotation)")
	public void MyAspect1() {
	}
	
	@Before("MyAspect1()")
    public void beforeMethod1(JoinPoint joinPoint) {
		System.out.println(joinPoint.getArgs()[0]);
		System.out.println(joinPoint.getArgs()[1]);
        System.out.println("前置通知");
    }*/
	
}
