import java.util.*;
//Create a class StringLengthWithoutUsingMethod to find and return the length of a string
public class StringLengthWithoutUsingMethod{
    // Method to find length of string without using length()
    public static int findLengthUsingCharAt(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking input using next()
        System.out.print("Enter the String: ");
        String text = sc.next();
        // User-defined method
        int userLength = findLengthUsingCharAt(text);
        // Built-in length() method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength using user-defined method: " + userLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
}
