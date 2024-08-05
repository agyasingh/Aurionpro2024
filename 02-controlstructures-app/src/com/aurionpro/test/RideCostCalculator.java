package com.aurionpro.test;

import java.util.Scanner;

public class RideCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height in cm: ");
        int height = scanner.nextInt();
        
        if (height <= 120) {
            System.out.println("Can't ride");
        } else {
            System.out.println("Can ride");
            
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            
            int cost = 0;
            
            if (age < 12) {
                cost = 5;
            } else if (age <= 18) {
                cost = 7;
            } else if (age >= 45 && age <= 55) {
                cost = 0;
            } else {
                cost = 12;
            }
            
            System.out.print("Do you want photos? (yes/no): ");
            String wantPhotos = scanner.next();
            
            if (wantPhotos.equalsIgnoreCase("yes")) {
                cost += 3;
            }
            
            System.out.println("The total bill is $" + cost);
        }
        
        scanner.close();
    }
}
