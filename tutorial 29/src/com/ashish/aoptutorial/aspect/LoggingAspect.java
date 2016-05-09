package com.ashish.aoptutorial.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("Advice Run. Get Method Called...");
	}
	
	@Before("allCircleMethods()")
	public void loggingCircleAdvice(){
		System.out.println("Logging Circle Advice run...");
	}
	
	@Before("allMethodsCircleAsParameter()")
	public void circleAsPara(){
		System.out.println("Circle as parameter advice called...");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second advice called...");
	}
	
	// -----------------------------------------------------------------
	
	@Pointcut("within(com.ashish.aoptutorial.model.Circle)")
	public void allCircleMethods(){}
	
	@Pointcut("args(com.ashish.aoptutorial.model.Circle)")
	public void allMethodsCircleAsParameter(){}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
}
