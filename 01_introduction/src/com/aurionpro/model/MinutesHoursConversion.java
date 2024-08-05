package com.aurionpro.model;

import java.util.Scanner;

public class MinutesHoursConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter minutes");
		int minutes=sc.nextInt();
		// Calculate hours and remaining minutes
		float hours=minutes/60;
		int minute=minutes%60;
		//converting the double output into integer output
		System.out.println((int)hours+ "hours and" + " " + minute + " " + "minutes");
}

}
