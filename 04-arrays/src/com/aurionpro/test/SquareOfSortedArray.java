package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements you want to square and sort");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); 
        }
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t"); 
        }
        System.out.println("");

      
        boolean isSorted = checkIfSorted(array);
        if (!isSorted) {
            System.out.println("Array is not sorted. Sorting...");
            mergeSort(array);
        }

        squareArray(array);

        System.out.println("Sorted and squared array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        scanner.close();
    }

    public static boolean checkIfSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return; // Array is already sorted if it has 0 or 1 element
        }
        
        int mid = n / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, n);
        
        mergeSort(left);
        mergeSort(right);
        
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            array[k++] = left[i++];
        }
        
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void squareArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
    }
}
