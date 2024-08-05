package com.aurionpro.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	Predicate<Integer> evenPredicate =(Integer number) ->(number%2==0) ;
//			return true;
//		return false;
	
	System.out.println(evenPredicate.test(5));
	
	BiPredicate<Integer,Integer> checkNumberGreater =(Integer number1,Integer number2) ->(number1>number2);
	
	System.out.println(checkNumberGreater.test(4,5));
}
}
