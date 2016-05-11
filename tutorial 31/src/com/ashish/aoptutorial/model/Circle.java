package com.ashish.aoptutorial.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Circle is setting here...");
		this.name = name;
		throw new RuntimeException();		
	}
	
	public String setNameReturnString(String name) {
		System.out.println("Circle is setting here...");
		this.name = name;
		return name;
	}
	
}
