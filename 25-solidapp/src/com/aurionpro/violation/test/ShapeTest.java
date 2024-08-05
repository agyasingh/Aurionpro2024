package com.aurionpro.violation.test;

import com.aurionpro.violation.model.Circle;
import com.aurionpro.violation.model.Rectangle;

public class ShapeTest {
public static void main(String[] args) {
	Circle circle=new Circle(8);
	circle.area();
	Rectangle rectangle=new Rectangle(8,2);
	rectangle.area();
}
}
