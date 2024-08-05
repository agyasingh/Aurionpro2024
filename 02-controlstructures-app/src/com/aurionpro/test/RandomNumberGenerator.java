package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Guess the number (between 0 and 99):");
            int guessedNumber = scanner.nextInt();
            int randomNumber = random.nextInt(100);

            if (guessedNumber > randomNumber) {
                System.out.println("Sorry, your number is too high.");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Sorry, your number is too low.");
            } else {
                System.out.println("Congratulations! You've guessed the number. You win :)");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
