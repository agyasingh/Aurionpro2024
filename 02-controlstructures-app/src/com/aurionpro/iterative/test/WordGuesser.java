package com.aurionpro.iterative.test;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // List of words to choose from
        String[] words = {"java", "python", "hangman", "programming", "developer"};
        String word = words[random.nextInt(words.length)];

        // Create a list of blanks equal to the length of the word
        ArrayList<Character> blanks = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            blanks.add('_');
        }

        int lives = 6; // Number of lives
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("Word: " + blanks);
            System.out.println("Lives: " + lives);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            boolean guessCorrect = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    blanks.set(i, guess);
                    guessCorrect = true;
                }
            }

            if (!guessCorrect) {
                lives--;
            }

            if (!blanks.contains('_')) {
                System.out.println("You won! The word was: " + word);
                gameOver = true;
            } else if (lives <= 0) {
                System.out.println("Game Over! You've run out of lives. The word was: " + word);
                gameOver = true;
            }
        }
        scanner.close();
    }
}
