package com.aurionpro.iterative.test;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number to check if it is armstrong or not");
	int number=scanner.nextInt();
	int sum=0;
	int remainder;
    int temp=number;
    int power=0;
    while(temp>0) {
		remainder=temp%10;//153=3
		power++;
		temp/=10;//15
		
	}
	//Armstrong Number
    int original_number=number;
	while(number>0) {
		remainder=number%10;//153=3
		number/=10;//15
		sum +=  (int)Math.pow(remainder,power);
		//sum = sum + (temp * temp * temp);
	}
	
	if(original_number==sum) {
		System.out.println("It is an armstrong number");
	}
	else {
		System.out.println("It is not an armstrong number");
	}
}
}
