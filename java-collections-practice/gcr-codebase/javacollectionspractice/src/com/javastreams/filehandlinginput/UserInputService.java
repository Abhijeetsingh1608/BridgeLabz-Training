package com.javastreams.filehandlinginput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputService {

    public static void takeInputAndSave(String fileName) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            FileWriter fw = new FileWriter(fileName);

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");

            fw.close();

            System.out.println("\nData successfully saved to file!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
