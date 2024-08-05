package com.aurionpro.test;

import java.util.Scanner;

public class MonthDisplay {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int month=scanner.nextInt();
	switch(month) {
	case 1:
	case 2:System.out.println("winter");
	       break;
	case 3:
	case 4:
	case 5:System.out.println("Summer");
	       break;
	case 6:
	case 7:
	case 8:
	case 9:System.out.println("Monsoon");
	       break;
	case 10:
	case 11:
	case 12:System.out.println("Winter");
	        break;
	}
}
}
