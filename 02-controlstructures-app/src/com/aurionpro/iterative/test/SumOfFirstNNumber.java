package com.aurionpro.iterative.test;
import java.util.Scanner;

public class SumOfFirstNNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	int sum=0;
	int i=1;
	while(i<=number) {
		sum=sum + i;
	    i++;
	}
	System.out.println("Sum of first N natural numbers is" + " " + sum);
}
}
