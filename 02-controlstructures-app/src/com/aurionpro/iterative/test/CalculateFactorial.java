package com.aurionpro.iterative.test;
import java.util.Scanner;
public class CalculateFactorial {
	public static void main(String[] args) {
	//factorialnumber- 5 4 3 2 1
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to calculate the factorial");
		int number=scanner.nextInt();
		int factorial=1;
		for(int i=number;number>0;i--) {
			factorial=factorial * i;//5
		}
		
		System.out.println(factorial);
}

}
