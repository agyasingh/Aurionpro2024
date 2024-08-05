package com.aurionpro.test;

import java.util.function.Supplier;

public class SupplierTest {
	
	//Supplier returns some value
	//method get()
public static void main(String[] args) {
	Supplier<Integer> randomNumberSupplier =() ->(int) (Math.random() * 1000);
	System.out.println(randomNumberSupplier.get());
	
}
}
