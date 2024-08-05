package com.aurionpro.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReaderTesting {
public static void main(String[] args) {
	
	FileInputStream fileInputStream;
	try {
		fileInputStream = new FileInputStream("D:\\techlab_training\\05-streams\\src\\com\\aurionpro\\test\\test1");
		int ch;
		FileOutputStream fileOutputStream=new FileOutputStream("D:\\techlab_training\\05-streams\\src\\com\\aurionpro\\test\\test2");
		
		try {
			while((ch=fileInputStream.read())!=-1) {
				fileOutputStream.write(ch);
				
			}
			
			
			System.out.println("file copied successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
}
}

