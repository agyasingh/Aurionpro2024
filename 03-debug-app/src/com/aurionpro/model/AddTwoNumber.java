package com.aurionpro.model;

import java.util.Scanner;

public class AddTwoNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int number1=scanner.nextInt();
	int number2=scanner.nextInt();
	int result=addition(number1,number2);
	System.out.println(result);
}
//static methods can import static members
private static int addition(int number1,int number2) {
	return number1-number2;
}
}
