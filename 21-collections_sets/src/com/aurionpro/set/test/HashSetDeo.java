package com.aurionpro.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDeo {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();//random order storage
		set.add("aagya");
		set.add("sakshi");
		System.out.println(set);
		
		
		LinkedHashSet<String> set2=new LinkedHashSet<String>();//random order storage
		set2.add("aagya");
		set2.add("sakshi");
		set2.add("string");
		System.out.println(set2);
		
	}

}
