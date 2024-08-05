package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	System.out.println("Enter a number to check if it is prime or not");
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
		int i=2;
		String isPrime="true";
		while(i<number) {
			if(number%i==0) {
				isPrime="true";	
			}
			i++;
		}
	if(isPrime.equalsIgnoreCase("true")) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
	}
}

