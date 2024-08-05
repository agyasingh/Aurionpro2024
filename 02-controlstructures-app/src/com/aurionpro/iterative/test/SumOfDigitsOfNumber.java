package com.aurionpro.iterative.test;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	int sum=0;
	while(number>0) {
		int remainder=number%10;
		sum=sum + remainder;
		number/=10;
	}
	System.out.println(sum);
}
}
