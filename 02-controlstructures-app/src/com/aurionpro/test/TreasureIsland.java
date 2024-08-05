package com.aurionpro.test;
import java.util.*;
public class TreasureIsland {
public static void main(String[] args) {
	System.out.println("Welcome to Treasure Island. Your mission is to find the treasure");
	System.out.println("Enter a choice left or right");
	Scanner scanner=new Scanner(System.in);
	String option=scanner.next();
	if(option.equalsIgnoreCase("right")) {
		System.out.println("Fall into a hole. Game over :(");
	}
	else if(option.equalsIgnoreCase("left")) {
		System.out.println("Type swim to swim or type wait to wait");
		String swim=scanner.next(); 
		if(swim.equalsIgnoreCase("swim")) {
			System.out.println("Attacked by trout.Game over :(");
		}
		else if(swim.equalsIgnoreCase("wait")) {
			System.out.println("Which door?");
			System.out.println("Enter a door color red, blue or yellow:");
			String color=scanner.next();
			if(color.equals("blue")){
				System.out.println("Eaten by beasts. Game over :(");
			}
			else if(color.equals("red")) {
				System.out.println("Burned by the fire.Game Over :(");
			}
			else if(color.equals("yellow")) {
				System.out.println("You Win :)");
			}
		 else {System.out.println("Invalid action.Game over :(");}
		}
		
	
	}
	 else {System.out.println("Invalid action.Game over :(");}
		
}
}
