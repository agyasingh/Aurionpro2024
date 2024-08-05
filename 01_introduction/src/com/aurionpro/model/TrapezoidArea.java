package com.aurionpro.model;
import java.util.*;
import java.util.Scanner;

public class TrapezoidArea {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter base1 of the trapezoid:");
	int base1=scanner.nextInt();
	System.out.print("Enter base2 of the trapezoid:");
	int base2=scanner.nextInt();
	System.out.print("Enter height of the trapezoid:");
	int height=scanner.nextInt();
	System.out.println("Area of trapezoid is" + " " + (base1+base2)/2 * height);
}
}
