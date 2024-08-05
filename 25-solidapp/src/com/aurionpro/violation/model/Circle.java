package com.aurionpro.violation.model;

public class Circle implements Shape {
	private int radius;

	

	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(radius*radius);
		
	}

}
