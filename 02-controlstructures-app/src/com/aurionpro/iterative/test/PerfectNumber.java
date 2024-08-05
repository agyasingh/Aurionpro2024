package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	System.out.println("Enter a number to check if it is perfect or not");
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	int i=1;
	int sum=0;
	while(i<number) {//1<6
		if(number%i==0) {//6%1==0
			sum=sum + i;//sum=1
		}
		i++;
	}
	if(number==sum) {
		System.out.println("perfect");
	}
	else {
		System.out.println("not perfect");
	}
		
}
}
