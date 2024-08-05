package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		Circle circle=new Circle(3);
		circle.area();
		Rectangle rectangle=new Rectangle(4, 5);
		rectangle.area();
		Triangle triangle=new Triangle(3,4);
		triangle.area();
	}

}
