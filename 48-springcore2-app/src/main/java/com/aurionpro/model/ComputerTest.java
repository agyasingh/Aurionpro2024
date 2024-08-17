package com.aurionpro.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
	//Here we are using java annotations no need of creating xml file.
	
	public static void main(String[] args) {
		//Kaunse path pe jaana hai that will be mentioned 
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Computer computer=context.getBean(Computer.class);
		
		System.out.println(computer);
		
		
	}

}
