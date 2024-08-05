package com.aurionpro.test;

import java.util.Scanner;

public class MaxElementInMultidimensionalArray {
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
	int max=matrix[0][0];
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			if(matrix[i][j]>max) {
				max=matrix[i][j];
			}
		}
		
	}
	System.out.print(max + " " + "is the max element");
}
}
