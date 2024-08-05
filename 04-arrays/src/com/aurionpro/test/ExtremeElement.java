package com.aurionpro.test;

import java.util.Scanner;

public class ExtremeElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nPeak Elements are");

        for (int i = 0; i < size; i++) {
            if ((i == 0 || array[i] >= array[i - 1]) && (i == size - 1 || array[i] >= array[i + 1])) {
                System.out.println(array[i]);
            }
        }
        scanner.close();
    }
}
