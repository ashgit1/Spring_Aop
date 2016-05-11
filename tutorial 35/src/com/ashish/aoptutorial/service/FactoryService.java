package com.ashish.aoptutorial.service;

import com.ashish.aoptutorial.model.Circle;
import com.ashish.aoptutorial.model.Triangle;

public class FactoryService {

	public static Object getBean(String beanType) {

		if (beanType.equals("shapeService")) {
			return new ShapeServiceProxy();
		} else if (beanType.equals("circel")) {
			return new Circle();
		} else if (beanType.equals("triangle")) {
			return new Triangle();
		} else {
			return null;
		}
	}
}
