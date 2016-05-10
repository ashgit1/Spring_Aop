package com.ashish.aoptutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.ashish.aoptutorial.model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
		System.out.println("Circle Advice Run..." + joinPoint.toString());
		System.out.println("Target Name : " + joinPoint.getTarget());
		Circle circle = (Circle) joinPoint.getTarget();
		circle.setName("Good Name");
		System.out.println("Circle Name: " + circle.getName());
	}
	
	@Before("args(name)")
	public void stringArgumentAdvice(String name){
		System.out.println("Method that takes String as parameter. Parameter : " + name);
	}
	
	// -----------------------------------------------------------------
	
	@Pointcut("within(com.ashish.aoptutorial.model.Circle)")
	public void allCircleMethods(){}
	
	
}
