import java.util.*;
// Create a class IllegalArgumentExceptions
public class IllegalArgumentExceptions{
    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }
    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught and handled.");
        } catch (RuntimeException e) {
            // Handling any other runtime exception
            System.out.println("Generic RuntimeException caught.");
        }
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking string input
        System.out.print("Enter the String: ");
        String text = sc.next();
        // Calling method to generate exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated.");
        }
        // Calling method to handle the RuntimeException
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        sc.close();
    }
}
