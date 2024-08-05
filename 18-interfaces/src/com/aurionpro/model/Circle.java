package com.aurionpro.model;

public class Circle implements Shape{
private int radius;

public Circle(int radius) {
	super();
	this.radius = radius;
}

@Override
public void area() {
	// TODO Auto-generated method stub
	System.out.println("Area of the circle is " + radius * radius);
}

}
