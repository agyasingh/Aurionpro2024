package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.*;

public class AccountNotifierTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Account account = new Account(123456789, "Swapnil Kulkarni", 1000.0);

        System.out.println("Choose notifications you want to register:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. WhatsApp");
        System.out.println("Enter your choices (comma separated, e.g., 1,2):");
        String[] choices = scanner.nextLine().split(",");

        for (String choice : choices) {
            switch (choice.trim()) {
                case "1":
                    account.registerNotifier(new EmailNotifier());
                    break;
                case "2":
                    account.registerNotifier(new SMSNotifier());
                    break;
//                case "3":
//                    account.registerNotifier(new WhatsappNotifier());
//                    break;
                default:
                    System.out.println("Invalid choice: " + choice);
            }
        }

        while (true) {
            System.out.println("\nChoose your operations:");
            System.out.println("1 for deposit");
            System.out.println("2 to withdraw");
            System.out.println("3 to check balance");
            System.out.println("4 to exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount you want to deposit:");
                    double creditAmount = scanner.nextDouble();
                    account.deposit(creditAmount);
                    break;
                case 2:
                    System.out.println("Enter amount you want to withdraw:");
                    double debitAmount = scanner.nextDouble();
                    try {
                        account.withdraw(debitAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Your existing balance is: " + account.getBalance());
//                    account.getNotifiers();
                    account.notifyAllNotifiers(account.getBalance(),null + " ");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
