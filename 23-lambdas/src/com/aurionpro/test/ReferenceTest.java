package com.aurionpro.test;

import com.aurionpro.model.ITest;
import com.aurionpro.model.Reference;

public class ReferenceTest {
public static void main(String[] args) {
	ITest test=Reference::new; //passing const of ref class to a functional interface
	
	method(test);
	
	ITest test1=Reference::staticPrint;
	method(test1); //static method
	
	Reference reference=new Reference();
	
	ITest test2=reference::print;
	method(test2);
}
//constructor,static method
private static void method(ITest test) {
	test.display();
}
}
