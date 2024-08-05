package com.aurionpro.model;

import java.util.Scanner;

public class DistanceFormula {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter distance of x2");
		double x2=scanner.nextDouble();
		System.out.print("Enter distance of x1");
		double x1=scanner.nextDouble();
		System.out.print("Enter distance of y1");
		double y1=scanner.nextDouble();
		System.out.print("Enter distance of y2");
		double y2=scanner.nextDouble();
		double distance1= (x2-x1);
		double distance2=(y2-y1);
		double a=Math.pow(distance1, 2);
		double b=Math.pow(distance2, 2);
		double formula=Math.sqrt(a + b);
		System.out.println("Distance formula is" + " " + formula);
		
	}
	

}

