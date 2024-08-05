package com.aurionpro.model;

import java.util.Scanner;

public class Operators3 {
       //Logical Operators
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first boolean value");
		boolean a=sc.nextBoolean();
		System.out.println("Enter second boolean value");
		boolean b=sc.nextBoolean();
		//Logical && returns true when both condition is true
		System.out.println(a&&b); //(true && true=true,false && false=false, true &&false=false,false&& true==false)
		//Logical || returns true when atleast one of the condition is true
		System.out.println(a||b);
		//Logical NOT
		System.out.println(!a);
		System.out.println(!b);
	}
}
