package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.*;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrentAccount currentAccount = new CurrentAccount(1200, "Astha Singh", 20000);
        SavingsAccount savingsAccount = new SavingsAccount(1300, "Aagya Singh", 15000);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Current Account Details");
            System.out.println("2. Display Savings Account Details");
            System.out.println("3. Credit Current Account");
            System.out.println("4. Debit Current Account");
            System.out.println("5. Credit Savings Account");
            System.out.println("6. Debit Savings Account");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentAccount.display();
                    break;
                case 2:
                    savingsAccount.display();
                    break;
                case 3:
                    System.out.print("Enter amount to credit in your current account: ");
                    double creditAmountCurrentAccount = scanner.nextDouble();
                    currentAccount.credit(creditAmountCurrentAccount);
                    break;
                case 4:
                    System.out.print("Enter amount to debit in your current account: ");
                    double debitAmountCurrentAccount = scanner.nextDouble();
                    currentAccount.debit(debitAmountCurrentAccount);
                    break;
                case 5:
                    System.out.print("Enter amount to credit in your savings account: ");
                    double creditAmountSavingsAccount = scanner.nextDouble();
                    savingsAccount.credit(creditAmountSavingsAccount);
                    break;
                case 6:
                    System.out.print("Enter amount to debit in your savings account: ");
                    double debitAmountSavingsAccount = scanner.nextDouble();
                    savingsAccount.debit(debitAmountSavingsAccount);
                    break;
                case 7:
                    System.out.println("Exiting..Thanks for using our application");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
