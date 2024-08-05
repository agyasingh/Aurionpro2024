package com.aurionpro.test;

import java.util.Scanner;

public class SortArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter size");
	int size=scanner.nextInt();
	int[] array=new int[size];
	System.out.println("Enter the elements");
	for(int i=0;i<size;i++) {
		array[i]=scanner.nextInt();
	}
	for(int i=0;i<size-1;i++) {
		for(int j=i+1;j<=size;j++) { 
			if(array[i]>array[j]) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		System.out.println(array[i]);
		
	}
	
}

}