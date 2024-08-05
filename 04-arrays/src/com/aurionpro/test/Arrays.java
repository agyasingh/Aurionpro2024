package com.aurionpro.test;

import java.util.Scanner;

public class Arrays {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter size");
	int size=scanner.nextInt();
	int[] array=new int[size];
	
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
	}
	for(int i=0;i<size;i++) {
		System.out.println(array[i]);
	}
}
}
