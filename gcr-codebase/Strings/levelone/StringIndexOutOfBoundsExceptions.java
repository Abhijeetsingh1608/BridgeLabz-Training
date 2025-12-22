import java.util.*;
// Create a class StringIndexOutOfBoundsException
public class StringIndexOutOfBoundsExceptions{
    // Method to generate StringIndexOutOfBoundsExceptions
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("StringIndexOutOfBoundsException caught and handled.");
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
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated.");
        }

        // Calling method to handle the RuntimeException
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);

        sc.close();
    }
}
