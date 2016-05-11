package com.ashish.aoptutorial.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Around("@annotation(com.ashish.aoptutorial.aspect.Loggable)")
	public Object aroundCustomAnnotationAdvice(ProceedingJoinPoint proceedingJoinPoint){
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
	
	@Pointcut("execution(* com.ashish.aoptutorial.service.*.*(..))")
	public void allServiceMethods(){}
	
	
}
