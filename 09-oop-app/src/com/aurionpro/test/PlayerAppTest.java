package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.PlayerApp;

public class PlayerAppTest {
	private static PlayerApp[] players;
	private static double[] average;
	private static double maxAverage;
	
	
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of players you wish to have");
	int size=scanner.nextInt();
	players=new PlayerApp[size]; 
	average=new double[size];
	
	for(int i=0;i<size;i++) {
		System.out.println("Set the player id");
		int playerid=scanner.nextInt();
		
		System.out.println("Enter name");
		String name=scanner.next();
		
		System.out.println("Enter number of matches");
		int matches=scanner.nextInt();
		
		System.out.println("Enter the amount of runs you have scored");
		int runs=scanner.nextInt();
		
		System.out.println("Enter number of wickets you have taken");
		int wickets=scanner.nextInt();
		
		players[i]=new PlayerApp(playerid,name,matches,runs,wickets);
	}
	
	
	for(int i=0;i<size;i++) {
		players[i].display();
		average[i]=players[i].calculateAverage();
		
		System.out.println("Average of the player is " + average[i]);
	}
	
	
	maximumAveragePlayer();
	displayPlayers();
	scanner.close();
	
}
public static void maximumAveragePlayer() {
	maxAverage=average[0];
	int index=0;
	for(int i=1;i<average.length;i++) {
		
		if(maxAverage<average[i]) {
				maxAverage=average[i];
				index=i;
		}
	}
	System.out.println(maxAverage + "is the maximum average " + "with the name " + players[index].getName());
	System.out.println();
}

public static void displayPlayers() {
	
	for(int i=0;i<average.length;i++) {
		for(int j=0;j<average.length-i-1;j++) {
			if(average[j]>average[j+1]) {
				
                double tempAvg = average[j];
                average[j] = average[j + 1];
                average[j + 1] = tempAvg;

              
                PlayerApp tempPlayer = players[j];
                players[j] = players[j + 1];
                players[j + 1] = tempPlayer;
			}
		}
	
	}
System.out.println("Players sorted by average");
for(int i=0;i<players.length;i++) {
	System.out.println(players[i].getName() + " with average " + average[i]);
}
}
}
