package com.aurionpro.test;

import java.util.Scanner;

public class CheckArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter element you want to find");
	int element=scanner.nextInt();
	int[] array=new int[5];
	System.out.println("Enter the elements in an array");
	for(int i=0;i<array.length;i++) {
		array[i]=scanner.nextInt();
	}
	for(int k=0;k<array.length;k++) {
		if(array[k]==element) {
			System.out.print(array[k] + " " + "found on" + k + " " + "index");
		}
	}
}
}
