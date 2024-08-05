package com.aurionpro.test;

import java.util.Scanner;

public class SquareOfSortedArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Taking input from the user
        }

        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t"); // Printing the input
        }
        System.out.println("");

        // Square and sort the array in O(n) time complexity
        int[] result = squareAndSort(array);

        System.out.println("Sorted and squared array:");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + "\t");
        }
    }

    public static int[] squareAndSort(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        // Using two-pointer technique to place the largest squares at the end of the result array
        while (left <= right) {
            int leftSquare = array[left] * array[left];
            int rightSquare = array[right] * array[right];
            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
