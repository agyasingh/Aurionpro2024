package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;

public class CarTest {
public static void main(String[] args) {
	Maruti maruti=new Maruti();
	maruti.start();
	maruti.stop();
	
	Mahindra mahindra=new Mahindra();
	mahindra.start();
	mahindra.stop();
	
	Tata tata=new Tata();
	tata.start();
	tata.stop();
}
}
