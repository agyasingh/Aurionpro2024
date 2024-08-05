package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class RefactoredPigDiceGame {
    private Scanner scanner;
    private Random random;
    private int turnCount;
    private int totalScore;

    public RefactoredPigDiceGame() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.turnCount = 0;
        this.totalScore = 0;
    }

    public static void main(String[] args) {
        RefactoredPigDiceGame game = new RefactoredPigDiceGame();
        game.playGame();
    }

    public void playGame() {
        while (totalScore < 20) {
            turnCount++;
            System.out.println("Turn " + turnCount);
            totalScore += playTurn();
            System.out.println("Total score: " + totalScore);
        }

        System.out.println("You finished in " + turnCount + " turns!");
        System.out.println("Game over!");
    }

    private int playTurn() {
        boolean turnActive = true;
        int turnScore = 0;

        while (turnActive) {
            char choice = getUserChoice();
            if (choice == 'r') {
                int die = rollDie();
                turnScore = updateTurnScore(die, turnScore);
                turnActive = die != 1;
            } else if (choice == 'h') {
                turnActive = false;
            }
        }

        System.out.println("Score for turn: " + turnScore);
        return turnScore;
    }

    private char getUserChoice() {
        System.out.print("Roll or hold? (r/h): ");
        return scanner.next().charAt(0);
    }

    private int rollDie() {
        int die = random.nextInt(6) + 1;
        System.out.println("Die: " + die);
        if (die == 1) {
            System.out.println("Turn over. No score.");
        }
        return die;
    }

    private int updateTurnScore(int die, int turnScore) {
        if (die != 1) {
            turnScore += die;
        }
        return turnScore;
    }
}
