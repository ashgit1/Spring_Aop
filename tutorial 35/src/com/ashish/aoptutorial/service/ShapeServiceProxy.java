package com.ashish.aoptutorial.service;

import com.ashish.aoptutorial.aspect.LoggingAspect;
import com.ashish.aoptutorial.model.Triangle;

public class ShapeServiceProxy extends ShapeService {

	@Override
	public Triangle getTriangle() {
		new LoggingAspect().loggingAdvice();
		return super.getTriangle();
	}
}
