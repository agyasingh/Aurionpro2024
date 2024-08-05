package com.aurionpro.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {
public static void main(String[] args) throws ClassNotFoundException {
	
	Class stringClass=Class.forName("java.lang.String") ;//class ka object return lrega.it is returning an object of class class.class is also an object of class
	
	System.out.println("Methods: ");
	
	Method stringMethods[]=stringClass.getMethods();
	
	for(Method method:stringMethods) {
		System.out.println(method.getName());
	}
	
	System.out.println("Constructors:");
	
	Constructor stringConstructor[]=stringClass.getConstructors();
	for(Constructor constructor:stringConstructor ) {
		Parameter[] stringParameter=constructor.getParameters();
		for(Parameter parameter:stringParameter) {
			System.out.println(constructor.getName() + "\t"+ parameter.getName());
		}
	}
}
}
