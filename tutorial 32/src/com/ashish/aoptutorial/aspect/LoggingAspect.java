package com.ashish.aoptutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	@Around("allGetter()")
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue= null;
		try {
			System.out.println("Before target method is called...");	// @Before	
			returnValue = proceedingJoinPoint.proceed();				// Middle man.
			System.out.println("After target method is called...");		// @After
		} catch (Throwable e) {
			System.out.println("After throwing exception in Target Method...");
		}
		System.out.println("After finally...");
		System.out.println("Returned object :" + returnValue.toString());
		return returnValue;
	}
	
	// -----------------------------------------------------------------
	
	@Pointcut("within(com.ashish.aoptutorial.model.Circle)")
	public void allCircleMethods(){}
	
	@Pointcut("execution(* get*())")
	public void allGetter(){}
	
	
}
