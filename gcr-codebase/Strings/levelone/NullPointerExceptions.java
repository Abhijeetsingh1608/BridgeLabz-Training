import java.util.*;
//Create a class NullPointerExceptions 
public class NullPointerExceptions {
    // Method to generate NullPointerException
    public static void generateException() {
        // Initializing String variable to null
        String s = null;
        System.out.println(s.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {

        // Initializing String variable to null
        String s= null;

        try {
            // This will cause NullPointerException
            System.out.println(s.length());
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("NullPointerException caught and handled.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Calling method to generate exception
        System.out.println("Generating NullPointerException:");
        generateException();

        // Refactored code to handle the RuntimeException
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
