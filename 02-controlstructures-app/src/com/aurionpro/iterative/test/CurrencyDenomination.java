package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CurrencyDenomination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter withdrawal amount :");
        int amount = scanner.nextInt();
        
        if (amount > 50000) {
            System.out.println("Amount exceeds withdrawal limit of 50000");
        } else if (amount % 100 != 0) {
            System.out.println("Amount should be in multiples of 100");
        } else {
            int[] denominations = {2000, 500, 200, 100};
            int[] counts = new int[denominations.length];
            
            for (int i = 0; i < denominations.length; i++) {
                counts[i] = amount / denominations[i];
                amount %= denominations[i];
            }
            
            for (int i = 0; i < denominations.length; i++) {
                if (counts[i] != 0) {
                    switch (denominations[i]) {
                        case 2000:
                            System.out.println("Two Thousand :" + counts[i]);
                            break;
                        case 500:
                            System.out.println("Five Hundred :" + counts[i]);
                            break;
                        case 200:
                            System.out.println("Two Hundred :" + counts[i]);
                            break;
                        case 100:
                            System.out.println("Hundred :" + counts[i]);
                            break;
                    }
                }
            }
        }
        scanner.close();
    }
}
