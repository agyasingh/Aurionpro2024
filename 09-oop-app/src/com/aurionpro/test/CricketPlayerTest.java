package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	
	CricketPlayer players[]=new CricketPlayer[11];
	System.out.println("Enter details of players");
	for(int i=0;i<players.length;i++) {
		System.out.println("Set the player id");
		int playerid=scanner.nextInt();
		
		System.out.println("Enter name");
		String name=scanner.next();
		
		System.out.println("Enter number of matches");
		int matches=scanner.nextInt();
		
		System.out.println("Enter the amount of runs you have scored");
		int runs=scanner.nextInt();
		
		System.out.println("Enter number of wickets");
		int wickets=scanner.nextInt();	
		
		players[i]=new CricketPlayer(playerid,name,matches,runs,wickets);
	}
		for(int i=0;i<players.length;i++) {
			players[i].display();
			
			players[i].calculateAverage();
		}
		
}
	//array of objects
	
	
	
	
	
}


