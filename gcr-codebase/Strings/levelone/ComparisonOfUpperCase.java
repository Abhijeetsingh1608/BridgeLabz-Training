import java.util.*;
//Create a class ComparisonOfUpperCase
public class ComparisonOfUpperCase{
    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII difference (32)
                ch = (char) (ch - 32);
            }
            // Append character to result
            result = result + ch;
        }
        return result;
    }
    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // If lengths differ, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        //Create a class Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        // User-defined uppercase conversion
        String upperCharAt = convertToUpperUsingCharAt(text);
        // Built-in uppercase conversion
        String upperBuiltIn = text.toUpperCase();

        // Compare both results
        boolean result = compareStringsUsingCharAt(upperCharAt, upperBuiltIn);

        // Display results
        System.out.println("\nUppercase using charAt(): " + upperCharAt);
        System.out.println("Uppercase using toUpperCase(): " + upperBuiltIn);
        System.out.println("Are both strings equal? " + result);

        sc.close();
    }
}
