package com.aurionpro.model;
import java.io.*;

//Code for serialization
class Demo implements java.io.Serializable{
	public int a; //using public class so that it can be used beyond the class.
	public String b;
	
	//Creating parametrized constructor
	Demo(int a,String b){
		this.a=a; //passing values using this keyword.
		this.b=b;
	}
}


public class Serialization {
public static void main(String[] args) {
	//Creating object of Demo class and passing the values to the constructor which 
	//is automatically called when object is made.
	Demo object=new Demo(1,"aagya");
	String filename="file.ser";
	
	//Serialization step
	//creating an object of FileOutputStream class and passing the filename file to it
	//saving of object in a file
	
	try {
		FileOutputStream file = new FileOutputStream(filename);
		//Creating object named out of ObjectOutputStream class and passing the file that has to be serialized
		ObjectOutputStream out=new ObjectOutputStream(file);

        // Writing the object to the file
        out.writeObject(object);
        
        out.close();
        file.close();
        
        System.out.println("Object has been serialized");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Reading the object from a file
	Demo object1=null;
	
	try {
		FileInputStream file = new FileInputStream(filename);
	    ObjectInputStream in = new ObjectInputStream(file);
	     
	    // Method for deserialization of object
	    object1 = (Demo)in.readObject();
	     
	    in.close();
	    file.close();
	     
	    System.out.println("Object has been deserialized ");
	    System.out.println("a = " + object1.a);
	    System.out.println("b = " + object1.b);
	} catch (IOException e) {
		System.out.println("IOException is caught");
	}
	catch(ClassNotFoundException ex)
    {
        System.out.println("ClassNotFoundException is caught");
    }
	
}
	
	
	
	
	
	
	
}

