package com.aurionpro.model;

import java.util.Scanner;

public class Swapper {
public static void main(String[] args) {
	
	
	int num1=Integer.parseInt(args[0]);

	int num2=Integer.parseInt(args[1]);
	System.out.println("Before swapping");
	System.out.println("Number1:" + " " + num1 +" " +"Number2:" + " " + num2);
	num1=num1+num2; 
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("After swapping");
	System.out.println("Number1:" + " " + num1 +" " +"Number2:" + " " + num2);
}
}
