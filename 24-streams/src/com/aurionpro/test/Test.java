package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
public static void main(String[] args) {
	
	List<Integer> numbers=Arrays.asList(20,15,25,45,35);
	
	//Stream<Integer> numberStream=numbers.stream();//copied into Streams.
	
	//numberStream.forEach((number) -> System.out.println(number));
	
	
	numbers.stream()
	       .forEach((number)-> System.out.println(number));
	System.out.println("All odd numbers");
	List<Integer> filteredNumbers=numbers.stream()
		   .filter((number) -> (number%2)!=0)
	       .filter((number) -> (number>25))
	       .collect(Collectors.toList());
	       
	filteredNumbers.stream().forEach((number) -> System.out.println(number));
	
	List<Integer> squareNumbers=numbers.stream()
	       .map((number)-> number * number)
	       .collect(Collectors.toList());
	  System.out.println("Square of the list");     
	squareNumbers.stream().forEach((number) -> System.out.println(number));
	
	
	int sum=numbers.stream().reduce(0,(number1,number2)->number1 + number2);
	
	System.out.println("sum: " + sum);
//	
//	List<Integer> sortedNumbers=numbers.stream().sorted().collect(Collectors.toList());
//	
//	sortedNumbers.stream().forEach((number)-> System.out.println(number));
//	
//	List<Integer> sortedNumbers2=numbers.stream().sorted()
//			                            .sorted(Comparator.reverseOrder())
//			                            .collect(Collectors.toList());
	
//	sortedNumbers2.stream().forEach((number)-> System.out.println(number));
	
	 // Sorting the numbers in ascending order
//    List<Integer> sortedNumbers = numbers.stream()
//            .sorted()
//	          .limit(3)
//            .collect(Collectors.toList());
//
//    // Reversing the sorted list
//    Collections.reverse(sortedNumbers);
	
	
	Optional<Integer> max=numbers.stream().max((number1,number2) -> number1-number2);
	if(max.isPresent()) {
	System.out.println("max is " + max.get());
	
	Optional<Integer> min=numbers.stream().max((number1,number2) -> number2-number1);
	if(min.isPresent()) {
	System.out.println("min is " + min.get());
	
	}
	}
}
}
