package com.aurionpro.test;

import java.util.Scanner;

public class MultiDimensionalArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter no of rows");
	int rows=scanner.nextInt();
	System.out.println("Enter no of columns");
	int columns=scanner.nextInt();
	int matrix[][]=new int[rows][columns];
	System.out.println("Enter array elements");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			matrix[i][j]=scanner.nextInt();
		}
	}
	
	
	System.out.println("The matrix is");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			System.out.print(matrix[i][j] + "\t");
		}
		System.out.println("");
	}
	System.out.println("Enter the element you want to search");
	int element=scanner.nextInt();
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			if(matrix[i][j]==element) {
				System.out.print(element + "found " + "at index" + " " + i + " " + j);
			}
		}
	}
}
}
