import java.util.Scanner;
//Create a class TrimUsingCharAt to perform trim operations using CharAt
public class TrimUsingCharAt {
    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
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
        // Take input
        System.out.print("Enter the text with spaces: ");
        String text = sc.nextLine();
        // Find start and end indexes for trimming
        int[] indexes = findTrimIndexes(text);
        // Get trimmed text using user-defined substring method
        String trimmedCharAt = substringUsingCharAt(text, indexes[0], indexes[1]);
        // Get trimmed text using built-in trim() method
        String trimmedBuiltIn = text.trim();
        // Compare both results
        boolean result = compareStringsUsingCharAt(trimmedCharAt, trimmedBuiltIn);

        // Display results
        System.out.println("\nTrimmed using charAt(): \"" + trimmedCharAt + "\"");
        System.out.println("Trimmed using built-in trim(): \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both strings equal? " + result);

        sc.close();
    }
}
