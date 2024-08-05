package com.aurionpro.model;

import java.util.Scanner;

public class Operators2 {
public static void main(String[] args) {
	//Relational Operators
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1");
	int number1=sc.nextInt();
	System.out.println("Enter number 2");
	int number2=sc.nextInt();
	System.out.println(number1>number2);
	System.out.println(number1>=number2);
	System.out.println(number1<number2);
	System.out.println(number1<=number2);
	System.out.println(number1!=number2);
	System.out.println(number1==number2);
}
}
