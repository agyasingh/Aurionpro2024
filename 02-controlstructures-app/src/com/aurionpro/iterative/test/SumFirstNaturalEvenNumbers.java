package com.aurionpro.iterative.test;

import java.util.Scanner;

public class SumFirstNaturalEvenNumbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	int i=1;
	int sum=0;
	while(i<=number) {
		if(i%2==0) {
			sum=sum+i;
			i++;
		}
	}
	System.out.println(sum);
}
}
