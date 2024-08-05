package com.aurionpro.test;

import java.util.Scanner;

public class TemperatureConversion {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 
    
    System.out.println("Enter temperature: ");
    double temperature = scanner.nextDouble();
   
    System.out.println("Choose conversion:");
    
    System.out.println("Choose conversion:");
    System.out.println("1. Celsius to Fahrenheit");
    System.out.println("2. Fahrenheit to Celsius");
    System.out.println("3. Celsius to Kelvin");
    System.out.println("4. Kelvin to Celsius");
    System.out.println("5. Fahrenheit to Kelvin");
    System.out.println("6. Kelvin to Fahrenheit");
    double F=9/5*temperature + 32;
    double k= temperature + 273.15;

    
    
    int choice = scanner.nextInt();
    switch(choice) {
    case 1: System.out.println("1. Celsius to Fahrenheit");
            System.out.println(F);
            break;
    case 2: System.out.println("2. Fahrenheit to Celsius");
            System.out.println((F-32)* 5/9);
            break;
    case 3: System.out.println("3. Celsius to Kelvin");
            System.out.println(k);
            break;
    case 4: System.out.println("4. Kelvin to Celsius");
            System.out.println(k-273.15);
            break;
    case 5: System.out.println("5. Fahrenheit to Kelvin");
            System.out.println((F-32)*5/9 + 273.15);
            break;
    case 6: System.out.println("6. Kelvin to Fahrenheit");
            System.out.println((k-273.15) * 9/5 +32);
            break;
    }
    
}
}
