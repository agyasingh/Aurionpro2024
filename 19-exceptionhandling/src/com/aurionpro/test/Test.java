package com.aurionpro.test;

public class Test {
public static void main(String[] args) {
	int number1=Integer.parseInt(args[0]);
	int number2=Integer.parseInt(args[1]);
	
	try {
	double result=number1/number2;
	System.out.println(result);
	}
	catch(ArithmeticException exception){
		exception.toString();
	}
	catch(ArrayIndexOutOfBoundsException exception){
		exception.toString();
	}
	catch(NumberFormatException exception){
		exception.toString();
	}
	
	catch(Exception exception){
		System.out.println("Exception occured");
	}
	finally {
		System.out.println("Inside finaly");
	}
	
	System.out.println("Exiting");
}
}
