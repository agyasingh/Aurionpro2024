package com.aurionpro.test;

import com.aurionpro.model.Account; // Assuming Account class is defined in com.aurionpro.model package

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AccountTest {
    private static List<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createAccounts();
        printAccounts();

        if (!accounts.isEmpty()) {
            findMinimumBalance();
            findMaximumBalance();
            findNamesGreaterThanSixCharacters();
            findTotalBalance();
        } else {
            System.out.println("No accounts created.");
        }
    }

    private static void createAccounts() {
        System.out.println("Enter the number of accounts:");
        int numberOfAccounts = scanner.nextInt();

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Enter account number:");
            int accountNumber = scanner.nextInt();

            System.out.println("Enter name:");
            String name = scanner.next();

            System.out.println("Enter balance:");
            int balance = scanner.nextInt();

            Account account = new Account(accountNumber, name, balance);
            accounts.add(account);
        }
    }

    private static void printAccounts() {
        System.out.println("List of Accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    private static void findMinimumBalance() {
        Account minBalanceAccount = accounts.stream()
                .min(Comparator.comparingInt(Account::getBalance))
                .orElse(null);

        if (minBalanceAccount != null) {
            System.out.println("Account with Minimum Balance:");
            System.out.println(minBalanceAccount);
        } else {
            System.out.println("No accounts found.");
        }
    }

    private static void findMaximumBalance() {
        Account maxBalanceAccount = accounts.stream()
                .max(Comparator.comparingInt(Account::getBalance))
                .orElse(null);

        if (maxBalanceAccount != null) {
            System.out.println("Account with Maximum Balance:");
            System.out.println(maxBalanceAccount);
        } else {
            System.out.println("No accounts found.");
        }
    }

    private static void findNamesGreaterThanSixCharacters() {
        List<String> namesGreaterThanSixChars = accounts.stream()
                .map(Account::getName)
                .filter(name -> name.length() > 6)
                .collect(Collectors.toList());

        if (!namesGreaterThanSixChars.isEmpty()) {
            System.out.println("Names greater than 6 characters:");
            namesGreaterThanSixChars.forEach(System.out::println);
        } else {
            System.out.println("No names found greater than 6 characters.");
        }
    }

    private static void findTotalBalance() {
        int totalBalance = accounts.stream()
                .mapToInt(Account::getBalance)
                .sum();

        System.out.println("Total Balance of all accounts: " + totalBalance);
    }
}
