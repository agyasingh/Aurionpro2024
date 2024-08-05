package com.aurionpro.iterative.test;

public class OddNumberPrinter {
public static void main(String[] args) {
	System.out.println("Odd number printer");
	int i=1;
	while(i<=100) {	
		if(i%2!=0) {
			System.out.println(i);
			i++;
		}
	}
}
}
