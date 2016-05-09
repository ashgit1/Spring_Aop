package com.ashish.aoptutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashish.aoptutorial.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("aoptutspring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		System.out.println(shapeService.getCircle().getName());
		
	}

}
