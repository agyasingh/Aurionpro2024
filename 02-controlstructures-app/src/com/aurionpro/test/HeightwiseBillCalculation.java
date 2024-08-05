package com.aurionpro.test;

import java.util.Scanner;

public class HeightwiseBillCalculation {
	public static void main(String[] args) {
		System.out.print("Heightwise Bill Calculation");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Height in cm");
		int height=scanner.nextInt();
		if(height>120) {
			System.out.println("can't ride");
		}
		else {
			System.out.println("can ride");
			System.out.println("Enter age");
			int age=scanner.nextInt();
			int bill=scanner.nextInt();
			if(age<12) {
				System.out.println(bill=bill + 5);
			}
			else if(age>=12 && age<=18) {
				System.out.println(bill=bill+ 7);
			}
			else if(age>18) {
				System.out.println(bill=bill+ 12);
			}
			else if(age>=45 && age<=55) {
				System.out.println(bill+=0);
			}
			else if(age>55){
				System.out.println(bill+=12);
			}
			boolean want_photos=scanner.nextBoolean();
			if(want_photos) {
				System.out.println("+$" + " " + 3);
			}
			else {
				System.out.println("The total bill is" + "$x");
			}
		}
		
	}

}
