package com.aurionpro.model;

public class Circle extends Shape {
	private int radius;
	

//	public Circle(int radius) {
//		super();
//		this.radius = radius;
//	}


	public Circle(int radius2) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}


	@Override
	public void area() {
		System.out.println("Area of circle is " + (3.14 + radius * radius));
		
	}
	

}
