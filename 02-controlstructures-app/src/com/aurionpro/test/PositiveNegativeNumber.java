package com.aurionpro.test;

import java.util.Scanner;

public class PositiveNegativeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
		double number=sc.nextDouble();
		if(number>0) {System.out.println("Positive number");}
		else {System.out.println("Negative number");}
	}
}
