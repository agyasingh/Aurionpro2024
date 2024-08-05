package com.aurionpro.model;

public class StringTest {
public static void main(String[] args) {
	String name1="Aagya";
	String name2="Aagya";
	name1=name1 + " Singh";
	String name3=new String("aagya1");
	String name4=new String("aagya1");
	System.out.println(name1.hashCode());//memory location>int conversion
	System.out.println(name2.hashCode());
	System.out.println(name3.hashCode());
	System.out.println(name1==name2);
	System.out.println(name1==name3);
	System.out.println(name3==name4);
	System.out.println(name1);
	
	//StringBuffer creation>mutable>thread safe>multithreading
	StringBuffer name5=new StringBuffer("aila");
	System.out.println(name5.hashCode());
	name5=name5.append("kya kia");
	System.out.println(name5.hashCode());
	
	//StringBuilder>mutable>not thread safe>single threaded
	StringBuilder sb=new StringBuilder("nishank");
	System.out.println(sb.hashCode());
	sb=sb.append("Jain");
	System.out.println(sb.hashCode());
}
}
//StringBuffer
