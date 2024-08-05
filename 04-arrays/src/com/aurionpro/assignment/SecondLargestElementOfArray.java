package com.aurionpro.assignment;

import java.util.Scanner;

public class SecondLargestElementOfArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        readArrayElements(array);

        System.out.println("Entered array:");
        printArrayElements(array);

        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest element: " + secondLargest);
    }

    private static void readArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private static void printArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array size should be at least 2 to find the second largest element.");
            return Integer.MIN_VALUE;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] > secondMax && array[i] != firstMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}
