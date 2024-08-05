package com.aurionpro.model;

import java.util.Scanner;

public class BMICalculator {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter height in m");
	double height=scanner.nextDouble();
	System.out.println("Enter weight in kgs");
	double weight=scanner.nextDouble();
	double BMI=weight/(height*height);
	//calculating the BMI of the person
	System.out.println("Your Body Mass Index(BMI) is" + " " + BMI + " kg/m2");
}
}
