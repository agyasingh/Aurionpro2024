package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

public class BoxTest {
public static void main(String[] args) {
	Box box1=new Box();
	Scanner scanner=new Scanner(System.in);
	
	
	
	
	System.out.println("Box1 is");
		
	System.out.println(box1.getWidth());
	System.out.println(box1.getHeight());
	System.out.println(box1.getDepth());
	
	
	//Printing the details of box2
	System.out.println("Enter width");
	int width=scanner.nextInt();
	
	System.out.println("Enter height");
	int height=scanner.nextInt();
	
	System.out.println("Enter depth");
	int depth=scanner.nextInt();
	
    Box box2=new Box(width,height,depth);
    System.out.println("Box2 is");
    
    
	System.out.println(box2.getDepth());
	System.out.println(box2.getHeight());
	System.out.println(box2.getWidth());
}
}
