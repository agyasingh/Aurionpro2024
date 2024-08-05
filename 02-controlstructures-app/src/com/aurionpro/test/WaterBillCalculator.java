package com.aurionpro.test;

import java.util.Scanner;

public class WaterBillCalculator {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number of units consumed");
	int units=scanner.nextInt();
	int meter_charge=75;
	int charge;
	int Total_water_bill;//350=units=>x>100+y>150+z>100
	for(int i=0;units<=100;i++){
	charge=units * 5;
	Total_water_bill=charge + meter_charge;
	System.out.println(Total_water_bill);
	}
	for(int i=101;units<=150;i++){
	charge=units * 10;
	Total_water_bill=charge + meter_charge;
	System.out.println(Total_water_bill);
	
	}
	for(int i=151;units<=350;i++){
	charge=units * 20;
	Total_water_bill=charge + meter_charge;
	System.out.println(Total_water_bill);
	
	}
	
}
}
