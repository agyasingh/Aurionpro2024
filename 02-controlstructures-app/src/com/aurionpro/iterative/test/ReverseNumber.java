package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number to reverse it");
	int number=scanner.nextInt();
	int reverse=0;
	int remainder;
    int temp=number;
  ;
    while(temp>0) {
		remainder=temp%10;//153=3
		reverse=reverse *10 + remainder;
		temp/=10;//15
		
	}
    System.out.println(reverse);
    if(number!=reverse) {
    	System.out.println("Number is reversed");
    }
    else {
    	System.out.println("Number is not reversed");
    }
}
}
