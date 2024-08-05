package com.aurionpro.model;
import java.io.*;

class Coffee implements Serializable{
	int i=10;
	transient final int j=20;//transient>variable should not be serialized
}

public class Serialization2 {
public static void main(String[] args) {
	Coffee c1=new Coffee();
	
	System.out.println("Serialization started");
	
	
	try {
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		//writeObject(c1) method serializes the c1 object and writes it to the file abc.ser.
		oos.writeObject(c1);
		System.out.println("Serialization ended");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//Deserialization started
	
	System.out.println("deserialization started");

	try {
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Coffee c2=(Coffee) ois.readObject();
		
		System.out.println("Deserialization ended");
	    System.out.println("Dog object data");
	    //final result
	    System.out.println(c2.i+"\t" +c2.j);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    
    
    
}
}
