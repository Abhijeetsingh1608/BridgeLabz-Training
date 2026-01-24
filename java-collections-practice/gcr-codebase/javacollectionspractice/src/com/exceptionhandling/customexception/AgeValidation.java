package com.exceptionhandling.customexception;

import java.util.Scanner;

public class AgeValidation {

    // 🔴 Custom Unchecked Exception (Inner Class)
    static class InvalidAgeException extends RuntimeException {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // ✅ Method that validates age
    static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);
            System.out.println("✅ Access granted!");

        } catch (InvalidAgeException e) {
            System.out.println("❌ " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
