package com.aurionpro.model;
import java.util.*;
//LinkedList implements collection interface.
//uses doubly linkedlist to store elements internally.
//can store duplicate elements.
//maintains insertion order.
//non-synchronized.
//manipulation fast> no shifting required.

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> linkedlist=new LinkedList<String>();
	linkedlist.addFirst("om");
	linkedlist.add("coffee");
	linkedlist.add("mirinda");
	linkedlist.add("coffee");
	linkedlist.addLast("aagya");
	
//	Iterator<String> iterator=linkedlist.iterator();
//	
//	while(iterator.hasNext()) {
//		System.out.println(iterator.next());
//	}
	
	for(String name:linkedlist) {
		System.out.println(name);
	}
}
	
	
}
