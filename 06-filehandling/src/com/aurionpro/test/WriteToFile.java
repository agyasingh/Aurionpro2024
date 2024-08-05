package com.aurionpro.test;
import java.io.IOException;
import java.io.*;
import java.io.FileWriter;

public class WriteToFile {
public static void main(String[] args) {
	//FileWriter class
	FileWriter writer;
	try {
		writer = new FileWriter("filename.txt");
		writer.write("I have started to like java which is unexpected!");
		writer.close();
		System.out.println("Successfully wrote to the file");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
