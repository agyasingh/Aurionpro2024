package com.aurionpro.test;

import java.util.Scanner;

public class VowlChecker {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a character");
    char ch=scanner.next().charAt(0);
    switch(ch)
    {
    	case 'a':
    	case 'e':
    	case 'i':
    	case 'o':
    	case 'u':System.out.println("vowel");
                 break;
        default:System.out.println("Not a vowel");
   
    }
}
}
