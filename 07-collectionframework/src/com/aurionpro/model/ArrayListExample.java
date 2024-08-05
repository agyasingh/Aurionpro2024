package com.aurionpro.model;
import java.util.*;
//Collection > framework> architecture> store and manipulate group of objects
//Group of individual objects >collection of objects
//Collection interface(Java.util.collection),Map interface(java.util.map)> major root interfaces
//operations-search, sort, insert, manipulate, delete.
//Interfaces- SET, LIST, QUEUE, DEQUEUE.
//Classes- ArrayList, Vector,LinkedList, PriorityQueue, HashSet, LinkedHashset, TreeSet
//List <data-type> list1=new ArrayList();
//How to declare an ArrayList
//ArrayList<data-type> arraylist=new ArrayList<data-type>();


//ArrayList- uses dynamic array,
//stores duplicate elements of different data types,
//maintains insertion order> 
//non-synchronized, 
//can be randomly accessed

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<String> arraylist= new ArrayList<String>(); //creating arraylist.
	arraylist.add("aagya");
	arraylist.add("sampada");
	arraylist.add("aagya");
	
	//Traversing list through iterator
	Iterator iterator=arraylist.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
