package com.ashish.aoptutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
		
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentAdvice(String name, String returnString){
		System.out.println("Method that takes String as parameter. Parameter : " + name + " and returning name"
							+ "	from target method is " + returnString);
	}
	
	@AfterThrowing(pointcut="args(exception)", throwing="exceptionObject")
	public void exceptionAdvice(String exception, Exception exceptionObject){
		System.out.println("Exception advice run..." + exceptionObject.toString());
	}
	
	// -----------------------------------------------------------------
	
	@Pointcut("within(com.ashish.aoptutorial.model.Circle)")
	public void allCircleMethods(){}
	
	
}
