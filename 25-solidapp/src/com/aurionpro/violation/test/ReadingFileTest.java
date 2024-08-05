package com.aurionpro.violation.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.violation.model.Students;

public class ReadingFileTest {
private static FileOutputStream fileoutputstream;
private static DataInputStream datainputsstream;
private static Scanner scanner=new Scanner(System.in);

public static void main(String[] args) throws IOException {
	File file=new File("D:\\techlab_training\\25-solidapp\\src\\test.txt");
	BufferedReader br = new BufferedReader(new FileReader(file));

	// Declaring a string variable
    String string;
    // Condition holds true till
    // there is character in a string
    while ((string = br.readLine()) != null)

        // Print the string
        System.out.println(string);
	
}
}


//private static void readDataFromKeyboard() {
//	// TODO Auto-generated method stub
//	//reading data from keyboard- associate keyboard with input stream class
//	datainputsstream =new DataInputStream(System.in);	
//	associateDataToFile();
//	
//}
//
//
//
//
//private static void associateDataToFile() {
//	// TODO Auto-generated method stub
//	try {
//	 fileoutputstream=new FileOutputStream("test.txt");
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	readAndWriteDataInputStream();
//}
//
//private static void readAndWriteDataInputStream() {
//	char ch;
//	try {
//		ch = (char)datainputsstream.read();
//		fileoutputstream.write(ch);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//}
//
//
//}
