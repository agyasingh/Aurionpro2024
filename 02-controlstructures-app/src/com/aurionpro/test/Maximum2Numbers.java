package com.aurionpro.test;

import java.util.Scanner;

public class Maximum2Numbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number 1");
	int number1=scanner.nextInt();
	System.out.println("Enter number 2");
	int number2=scanner.nextInt();
	if(number1>number2) {
		System.out.println("Number1 i.e." + " " + number1 + " " + "is greater");
	}
	else {
		System.out.println("Number2 i.e." + " " + number2 + " " + "is greater");
	}
}
}
