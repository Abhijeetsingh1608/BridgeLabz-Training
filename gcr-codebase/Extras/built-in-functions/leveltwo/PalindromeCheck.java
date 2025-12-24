// Program: Palindrome Check
import java.util.*;
public class PalindromeCheck {
    // Function to take input from user
    public static String getInput(Scanner in) {
        System.out.print("Enter a string: ");
        return in.nextLine();
    }
    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        // Normalize string: remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
	
    // Function to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome.");
        }
    }
    //Calling Main Method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = getInput(in);
        boolean result = isPalindrome(input);

        displayResult(input, result);

        in.close();
    }
}