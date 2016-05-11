package com.ashish.aoptutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashish.aoptutorial.service.ShapeService;

public class AopMain {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("aoptutspring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		//shapeService.getCircle().setNameReturnString("Sweet Circle");
		shapeService.getCircle().setName("Sweet Circle");
		
		System.out.println(shapeService.getCircle().getName());
		
	}

} 
