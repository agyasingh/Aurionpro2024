package com.aurionpro.model;

import java.util.Scanner;

public class CompundInterest {
public static void main(String[] args) {
	//Taking input from the user
	Scanner scanner=new Scanner(System.in);
	double amount;
	System.out.print("Enter the principal amount:");
	double principle=scanner.nextDouble();
	System.out.print("Enter interest rate:");
	double rate=scanner.nextDouble(); //Decimal
	System.out.print("Enter time in years:");
	double time=scanner.nextDouble();
	double compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
    System.out.print("Compound Interest is:" + " " + compound_interest);
	}
}
