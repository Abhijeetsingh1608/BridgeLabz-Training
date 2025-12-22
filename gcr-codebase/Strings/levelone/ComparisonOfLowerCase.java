import java.util.*;
//Create a class 
public class ComparisonOfLowerCase{
    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLowerUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII difference (32)
                ch = (char) (ch + 32);
            }
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
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        // User-defined lowercase conversion
        String lowerCharAt = convertToLowerUsingCharAt(text);
        // Built-in lowercase conversion
        String lowerBuiltIn = text.toLowerCase();
        // Compare both results
        boolean result = compareStringsUsingCharAt(lowerCharAt, lowerBuiltIn);

        // Display results
        System.out.println("\nLowercase using charAt(): " + lowerCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerBuiltIn);
        System.out.println("Are both strings equal? " + result);

        sc.close();
    }
}
