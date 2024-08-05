package com.aurionpro.test;

import java.util.Scanner;

public class MaxElementArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=scanner.nextInt();
	
	int[] array=new int[size];
	System.out.println("Enter the elements you want to add in the array");
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
	}
	int max=array[0];
	for(int i=0;i<size;i++) {
		if(max<array[i]) {
			max=array[i];
		}
	}
	System.out.println(max);
	
}
}
