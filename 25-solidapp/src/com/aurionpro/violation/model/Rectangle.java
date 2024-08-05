package com.aurionpro.violation.model;

public class Rectangle implements Shape {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(width * height);
	}

}
