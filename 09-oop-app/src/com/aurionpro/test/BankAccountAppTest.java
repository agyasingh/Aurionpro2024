package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aInvaurionpro.exception.InvalidAmountException;
import com.aurionpro.exception.InsufficientBalanceException;
import com.aurionpro.model.BankAccountApp;

public class BankAccountAppTest {
    private static BankAccountApp[] bankaccounts;
    public static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number of accounts you want to create");
            int numberOfAccounts = scanner.nextInt();
            bankaccounts = new BankAccountApp[numberOfAccounts];

            for (int i = 0; i < numberOfAccounts; i++) {
                int accountNumber = random.nextInt(1000000000);
                System.out.println("Your account number is " + accountNumber);
                System.out.println("Enter account type");
                String accountType = scanner.next();

                System.out.println("Enter the Name: ");
                String accountName = scanner.next();

                System.out.println("Enter the balance: ");
                int accountBalance = scanner.nextInt();

                bankaccounts[i] = new BankAccountApp(accountNumber, accountType, accountName, accountBalance);
                System.out.println("Account created successfully.");
            }

            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Credit Amount");
                System.out.println("2. Debit Amount");
                System.out.println("3. Show Details");
                System.out.println("4. Show Account with Maximum Balance");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter your account number");
                        int accountNumberCheck1 = scanner.nextInt();
                        BankAccountApp accountExists1 = findAccount(accountNumberCheck1);
                        if (accountExists1 != null) {
                            try {
                                System.out.println("Enter the amount you want to credit");
                                int creditAmount = scanner.nextInt();
                                accountExists1.credit(creditAmount);
                                System.out.println("Amount credited successfully.");
                            } catch (InvalidAmountException e) {
                                System.out.println("Invalid amount: " + e.getMessage());
                            }
                        } else {
                            System.out.println("Account not found.");
                        }
                        break;

                    case 2:
                        System.out.println("Enter your account number");
                        int accountNumberCheck2 = scanner.nextInt();
                        BankAccountApp accountExists2 = findAccount(accountNumberCheck2);
                        if (accountExists2 != null) {
                            try {
                                System.out.println("Enter the amount you want to debit");
                                int debitAmount = scanner.nextInt();
                                accountExists2.debit(debitAmount);
                                System.out.println("Amount debited successfully.");
                            } catch (InvalidAmountException | InsufficientBalanceException e) {
                                System.out.println("Transaction failed: " + e.getMessage());
                            }
                        } else {
                            System.out.println("Account not found.");
                        }
                        break;

                    case 3:
                        System.out.println("Enter your account number");
                        int accountNumberCheck3 = scanner.nextInt();
                        BankAccountApp accountExists3 = findAccount(accountNumberCheck3);
                        if (accountExists3 != null) {
                            System.out.println("Your account details are:");
                            accountExists3.accountDetails();
                        } else {
                            System.out.println("Account not found.");
                        }
                        break;

                    case 4:
                        BankAccountApp maxBalanceAccount = getMaximumBalanceAccount();
                        if (maxBalanceAccount != null) {
                            System.out.println("Account with maximum balance:");
                            maxBalanceAccount.accountDetails();
                        } else {
                            System.out.println("No accounts available.");
                        }
                        break;

                    case 5:
                        System.out.println("Thanks for using our application.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid Choice");
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static BankAccountApp findAccount(int accountNumber) {
        for (BankAccountApp account : bankaccounts) {
            if (account != null && account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    private static BankAccountApp getMaximumBalanceAccount() {
        if (bankaccounts.length == 0) return null;
        BankAccountApp maxBalanceAccount = bankaccounts[0];
        for (BankAccountApp account : bankaccounts) {
            if (account != null && account.getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = account;
            }
        }
        return maxBalanceAccount;
    }
}
