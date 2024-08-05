package com.aurionpro.model;
import java.util.*;

//subclass of vector
//implements lifo
//boolean push()
//boolean peek()
public class StackExample {
public static void main(String[] args) {
		Stack<String> stack=new Stack();
		stack.push("aagya");
		stack.push("poonam");
		stack.push("astha");
		stack.push("sangeev");
		stack.push("singh");
		stack.pop();
		Iterator<String> iterator=stack.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
}
}
