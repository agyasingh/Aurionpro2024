package com.aurionpro.violation.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadFileLinesUsingStream {

    public static void main(String[] pArgs) throws IOException {
        String fileName = "D:\\techlab_training\\25-solidapp\\src\\test.txt";
        File file = new File(fileName);

        try (Stream<String> linesStream = Files.lines(file.toPath())) {
            linesStream.forEach(line -> {
                System.out.println(line);
            });
        }
    }
}