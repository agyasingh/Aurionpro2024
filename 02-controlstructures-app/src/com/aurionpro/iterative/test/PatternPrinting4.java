package com.aurionpro.iterative.test;
import java.util.Scanner;
import java.util.*;



	
public class PatternPrinting4 {
    public static void main(String[] args) {
        int n = 5; // Number of lines for the pattern
        int count = 0; // Count of prime numbers printed
        int num = 2; // Number to check for prime

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                while (!isPrime(num)) {
                    num++;
                }
                System.out.print(num + " ");
                num++;
                count++;
            }
            System.out.println();
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


