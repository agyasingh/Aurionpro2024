package com.aurionpro.test;
import com.aurionpro.model.*;

import com.aurionpro.model.Number;
public class NumberTest {
public static void main(String[] args) {
	
	Number number1=new Number(10);
	Number number2=new Number(20);
	
	System.out.println("Before swapping");
	System.out.println("Number1" + "\t" +number1.getVlaue()+ "Number2" + "\t"+ number2.getVlaue());
	swap(number1,number2);
	
	System.out.println("After swapping");
	System.out.println("Number1" + "\t" +number1.getVlaue()+ "Number2" + "\t"+ number2.getVlaue());
}
	
	public static void swap(Number number1,Number number2) {
		int temp=number1.getVlaue();
		number1.setValue(number2.getVlaue());
		number2.setValue(temp);
	}
}


