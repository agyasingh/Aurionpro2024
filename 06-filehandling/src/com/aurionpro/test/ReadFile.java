package com.aurionpro.test;
import java.io.File;  // 
import java.io.FileNotFoundException;  // 
import java.util.Scanner; //


public class ReadFile {
public static void main(String[] args) {
	
	
	try {
		File file=new File("filename.txt");
		Scanner reader = new Scanner(file);
		while(reader.hasNextLine()) {
			String data=reader.nextLine();
			System.out.println(data);
		}
		reader.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
