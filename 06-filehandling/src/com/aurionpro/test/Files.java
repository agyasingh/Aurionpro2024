package com.aurionpro.test;
import java.util.*;
import java.io.File;
import java.io.IOException;

//File Class- CreateFile

public class Files {
public static void main(String[] args) {
		try {
		File file=new File("filename.txt");

		if(file.createNewFile()) {
			System.out.println("File created" + " " + file.getName());
		}
		else {
			System.out.println("File already exits");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
