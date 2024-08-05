package com.aurionpro.iterative.test;
import java.util.Scanner;


public class PatternPrinting2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int rows=scanner.nextInt();
	int k=1;
	for(int i=0;i<rows;i++) {//i=1
		for(int j=0;j<=i;j++) {//j=0,1
			System.out.print(k);
		}
		k++;
		System.out.println(" "+ " ");
	}
}
}

