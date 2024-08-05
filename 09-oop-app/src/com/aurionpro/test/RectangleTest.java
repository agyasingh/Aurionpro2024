package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;

public class RectangleTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Rectangle rectangle1=new Rectangle();
	
	//first object
		
	System.out.println("Length of first rectangle is" + " " +rectangle1.getLength());
	System.out.println("Breadth of first rectangle is" + " " +rectangle1.getBreadth());
	
	//second object
	System.out.println("Enter length for first rectangle");
	int l=scanner.nextInt();
	
	System.out.println("Enter breadth for first rectangle");
	int b=scanner.nextInt();
	
	Rectangle rectangle2=new Rectangle(l,b);
	
	System.out.println("Length of second rectangle is" + " " +rectangle2.getLength());
	System.out.println("Breadth of second rectangle is" + " " +rectangle2.getBreadth());
	
	
	
}
}
