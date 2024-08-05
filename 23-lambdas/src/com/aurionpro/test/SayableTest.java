package com.aurionpro.test;

import com.aurionpro.model.ISayable;

public class SayableTest {
public static void main(String[] args) {
	//definition of a method is passed to some variable.
	ISayable sayable=()-> System.out.println("I am inside Sayable");
    
	//passing variable to another method.
	sayHello(sayable);
	
//	ISayable sayable=new ISayable(){
//		public void say() {
//			System.out.println("I am inside sayable");
//		}
		
		
//	};
	//sayable.say();
}


//passing definition of a method to another method.
private static void sayHello(ISayable sayable) {
	sayable.say();
}
}
