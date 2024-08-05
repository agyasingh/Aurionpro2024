package com.aurionpro.test;

import java.util.function.BiConsumer;

public class MyConsumerTest {
public static void main(String[] args) {
	BiConsumer<Integer,Integer> consumer=(Integer number1,Integer number2) -> System.out.println(number1 + number2);
	
	consumer.accept(1, 2);
}
}
