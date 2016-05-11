package com.ashish.aoptutorial.service;

import com.ashish.aoptutorial.aspect.Loggable;
import com.ashish.aoptutorial.model.Circle;
import com.ashish.aoptutorial.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	@Loggable
	public Triangle getTriangle() {
		System.out.println("Triangle getter called...");
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
