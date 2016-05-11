package com.ashish.aoptutorial;

import com.ashish.aoptutorial.service.FactoryService;
import com.ashish.aoptutorial.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("aoptutspring.xml");
		//ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		ShapeService shapeService = (ShapeService) FactoryService.getBean("shapeService");
		shapeService.getTriangle();
	}

} 
