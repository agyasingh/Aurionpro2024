package com.aurionpro.test;

import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter size");
	int size=scanner.nextInt();
	int[] array=new int[size];
	int sum=0;	
	System.out.println("Enter the elements");
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
	}
	for(int i=0;i<size;i++) {
		sum=sum + array[i];
	}
	System.out.println(sum);
}
}
