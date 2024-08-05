package com.aurionpro.violation.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileUsingFileReader {
public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader(
            "D:\\techlab_training\\25-solidapp\\src\\test.txt");
 
        // Declaring loop variable
        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)
 
            // Print all the content of a file
            System.out.print((char)i);
    

}
}
