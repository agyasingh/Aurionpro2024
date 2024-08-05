package com.aurionpro.test;

import java.util.Scanner;

public class ShiftCharactersByN {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
	String string=scanner.next();
	System.out.println("Enter the number by which you want to shift");
	int n=scanner.nextInt();
	char[] character=new char[10];
	char[] shifted_character=new char[10];
	character=string.toCharArray();
	
	for(int i=0;i<character.length;i++) {
		shifted_character[i]=(char)(character[i] + n);
		System.out.print(shifted_character[i]);
	}
	
	}
}
