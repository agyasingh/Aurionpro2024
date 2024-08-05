package com.aurionpro.test;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=scanner.nextInt();
		System.out.println("Enter no of columns");
		int columns=scanner.nextInt();
		int matrix[][]=new int[rows][columns];
		int multiplicated_matrix[][]=new int[rows][columns];
		System.out.println("Enter first array elements");
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
		
		//Entering array elements for second array
		System.out.println("Enter second array elements");
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
		
		//doing the multiplication of elements
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				 
					multiplicated_matrix[i][j]=matrix[i][j] * matrix[i][j];
				
			}
			
		}
		System.out.println("Multiplication of the 2 matrices are");
		//printing sum_matrix
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {				 
				System.out.print(multiplicated_matrix[i][j] + "\t");
				
			}
			System.out.println("");
			
		}
		
	}
}

