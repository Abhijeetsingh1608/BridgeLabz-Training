import java.util.Scanner;
//Create a class StringComparison to compare two strings
public class StringComparison{
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        // All characters matched
        return true;
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        // Compare using charAt() method
        boolean charAtResult = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean equalsResult = str1.equals(str2);

        // Display results
        System.out.println("\nResult using charAt() method: " + charAtResult);
        System.out.println("Result using equals() method: " + equalsResult);

        // Check if both results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both comparison methods give the SAME result.");
        } else {
            System.out.println("Both comparison methods give DIFFERENT results.");
        }

        input.close();
    }
}
