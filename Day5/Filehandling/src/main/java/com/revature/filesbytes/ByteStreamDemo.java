package com.revature.filesbytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        // Define file paths
        String sourceFile = "D:\\Training\\File1.txt";
        String destinationFile = "D:\\Training\\File2.txt";
        System.out.println("Hello Files");
        
        // Use try-with-resources to ensure streams are closed properly
        try (FileInputStream input = new FileInputStream(sourceFile);
             FileOutputStream output = new FileOutputStream(destinationFile)) {

            int c;
            // Read bytes from source file and write to destination file
            while ((c = input.read()) != -1) {
                output.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
