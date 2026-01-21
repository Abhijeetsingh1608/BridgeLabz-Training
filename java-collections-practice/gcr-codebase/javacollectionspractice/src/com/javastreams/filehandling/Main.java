package com.javastreams.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Read from source file
            fis = new FileInputStream(sourceFile);

            // Write to destination file (created if not exists)
            fos = new FileOutputStream(destFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");

        } catch (IOException e) {
            System.out.println("I/O Error occurred: " + e.getMessage());

        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}

