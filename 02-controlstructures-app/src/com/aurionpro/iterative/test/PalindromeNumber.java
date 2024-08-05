package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number to check if it is palindrome or not");
	int number=scanner.nextInt();
	int temp=number;
	int reverse=0;
	while(temp>0) {
		int remainder=temp%10;
		reverse=reverse*10 + remainder;
		temp/=10;//1
	}
	if(number==reverse) {
		System.out.println("It is a palindrome number");
	}
	else {
		System.out.println("It is not a palindrome number");
	}
}
}
