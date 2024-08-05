package com.aurionpro.test;
import com.aurionpro.model.*;

public class ShapeTest {
public static void main(String[] args) {
	Shape shape;
	shape=new Circle(5);
	shape.area();
	shape=new Rectangle(4,5);
	shape.area();
	shape=new Triangle(3,4);
	shape.area();
	
}
}
