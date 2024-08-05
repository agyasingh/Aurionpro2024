package com.aurionpro.model;
import java.util.*;


//fifo
//ordered list
//hold elements which are about to be processed.
//PriorityQueue,Deque,ArrayDeque> implements queue interface

//**PriorityQueue**
public class QueueInterfaceExample {
public static void main(String[] args) {
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Rohit Sharma");  
	queue.add("Hardik pandya");  
	queue.add("Virat Kohli");  
	queue.add("Bumrah");  
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("iterating the queue elements:");  
	Iterator iterator=queue.iterator();  
	while(iterator.hasNext()){  
	System.out.println(iterator.next());  
	}  
	queue.remove();  
	queue.poll();  
	System.out.println("after removing two elements:");  
	Iterator<String> iterator2=queue.iterator();  
	while(iterator2.hasNext()){  
	System.out.println(iterator2.next());  
	}  
	}  
	}  
