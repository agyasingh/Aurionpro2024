package com.aurionpro.iterative.test;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int turnCount = 0;

        while (totalScore <=20) {
            turnCount++;
            int turnScore = 0;
            boolean turnActive = true;
            System.out.println("TURN " + turnCount);

            while (turnActive) {
                System.out.print("Roll or hold? (r/h): ");
                char choice = scanner.next().charAt(0);

                if (choice == 'r') {
                    int die = random.nextInt(6);
                    System.out.println("Die: " + die);

                    if (die == 1) {
                        System.out.println("Turn over. No score.");
                        turnScore = 0;
                        turnActive = false;
                    } else {
                        turnScore += die;
                    }
                } else if (choice == 'h') {
                    totalScore += turnScore;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore);
                    turnActive = false;
                } else {
                    System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
                }
            }
        }

        System.out.println("You finished in " + turnCount + " turns!");
        System.out.println("Game over!");
    }
}
