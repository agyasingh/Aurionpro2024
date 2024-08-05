package com.aurionpro.test;

import com.aurionpro.model.*;

public class Test {
public static void main(String[] args) {
	Base base=new Base();
	base.display();
	base=new Derived1();//base is referring to the new object
	//base.display1(); //method overriding is not involved so it won't be able to call display1
	base=new Derived2();
	base.display();
}
}
