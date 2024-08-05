package com.aurionpro.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfElementsOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int[] result = productExceptSelf(array);
        
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Product Array: " + Arrays.toString(result));
        
        scanner.close();
    }

    public static int[] productExceptSelf(int[] array) {
        int n = array.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] product = new int[n];

       
        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * array[i - 1];
        }

        rightProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * array[i + 1];
        }

        
        for (int i = 0; i < n; i++) {
            product[i] = leftProduct[i] * rightProduct[i];
        }

        return product;
    }
}
