import java.util.*;
// Create a class NumberFormatExceptions
public class NumberFormatExceptions{
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }
    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println("NumberFormatException caught and handled.");
        } catch (RuntimeException e) {
            // Handling any other runtime exception
            System.out.println("Generic RuntimeException caught.");
        }
    }

    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking input as String
        System.out.print("Enter the String: ");
        String text = sc.next();
        // Calling method to generate exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated.");
        }

        // Calling method to handle the RuntimeException
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        sc.close();
    }
}
