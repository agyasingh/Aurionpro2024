package com.aurionpro.model;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle is " + (0.5 * base * height));
		
	}
	

}
