package com.aurionpro.test;

import java.util.function.Consumer;

public class FactorialConsumer {
	public static void main(String[] args) {
			//If i want to pass only one argument
		Consumer<Integer> factorialconsumer=(Integer number)-> {
			int f=1;
		    for(int i=2;i<=number;i++) {
		    	f=f*number;
				System.out.print("Factorial is" + f);
		    }
			
		};
		
		factorialconsumer.accept(5);
	}

}

