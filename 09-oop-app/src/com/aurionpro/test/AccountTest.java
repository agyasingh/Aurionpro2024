package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account type");
        System.out.println("Choose between two options- ");
        System.out.println("1. Savings account");
        System.out.println("2. Current account");

        int choice = scanner.nextInt();
        AccountType accountType = null;

        if (choice == 1) {
            accountType = AccountType.Savings;
            System.out.println("You chose savings account");
        } else if (choice == 2) {
            accountType = AccountType.current;
            System.out.println("You chose current account");
        } else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }

        Account account1 = new Account(1, "abc", 50000, accountType);
        System.out.println("Account created: " + account1);

        scanner.close();
    }
}
