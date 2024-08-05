package com.aurionpro.test;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number1");
	int number1=sc.nextInt();
	System.out.println("Enter number2");
	int number2=sc.nextInt();
	System.out.println("Enter number3");
	int number3=sc.nextInt();
	if(number1>number2 && number1>number3) {
		System.out.println("Number1 i.e" + " " + number1 + "is greater");
	}
	if(number2>number3 && number2>number1) {
		System.out.println("Number2 i.e" + " " + number2 + "is greater");
	}
	
}
}
