package com.aurionpro.iterative.test;
import java.util.Scanner;

public class TablesOfNumbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of tables you want to print");
	int number=scanner.nextInt();
	
	for(int i=1;i<=number;i++){
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			
		}
	}
}
}
