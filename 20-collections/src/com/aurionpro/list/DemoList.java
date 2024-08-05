package com.aurionpro.list;

import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.ArrayList;

//arraylist
//dynamic
//add,remove whenever i want
//duplication allowed
public class DemoList {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	
	
	System.out.println(list.size());
	list.add("aagya");
	list.add("astha");
	list.add("aagya");
	
	
//	for() {
//		list.get()
//	}
	
//	for(String list:list) {
//		System.out.println(name);
//	}
	
//	Iterator<String> iterator=list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//	
	//list.set() replace the element
	
	
//	ListIterator<String> listiterator=list.listIterator();
//	
//	while(listiterator.hasNext()) {
//		System.out.println(listiterator.next());
//	}
	
	//To print the elements from back
//	while(listiterator.hasPrevious()) {
//	System.out.println(listiterator.next());
//}
	
}
}
