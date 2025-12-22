import java.util.Scanner;
//Create a class CharacterArrayComparison to compare character array
public class CharacterArrayComparison {
    // Method to return characters of a string without using toCharArray()
    public static char[] getCharactersUsingCharAt(String s) {
        // Create a character array of same length as string
        char[] chars = new char[s.length()];

        // Store each character using charAt()
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return chars;
    }
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        // If lengths are difefrent, arrays are not equal
        if (arr1.length != arr2.length) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take string input
        System.out.print("Enter the String: ");
        String s = sc.next();
        // User-defined method using charAt()
        char[] userDefinedArray = getCharactersUsingCharAt(s);
        // Built-in method toCharArray()
        char[] builtInArray = s.toCharArray();
        // Compare both arrays
        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        // Display characters
        System.out.print("\nCharacters using user-defined method: ");
        for (char ch : userDefinedArray) {
            System.out.print(ch + " ");
        }
        System.out.print("\nCharacters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        // Display comparison result
        System.out.println("\n\nAre both character arrays equal? " + result);

        sc.close();
    }
}
