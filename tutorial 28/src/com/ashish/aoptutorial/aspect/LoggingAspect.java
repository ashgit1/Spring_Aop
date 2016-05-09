package com.ashish.aoptutorial.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters()")
	public void loggingAdvice(){
		System.out.println("Logging Advice run. Get method called...");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice run. Get method called...");
	}

	@Pointcut("execution(* get*())")
	public void allGetters(){}
}
