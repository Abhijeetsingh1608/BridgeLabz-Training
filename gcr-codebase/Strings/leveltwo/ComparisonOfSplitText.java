import java.util.*;
//Create a class ComparisonOfSplitText
public class ComparisonOfSplitText{
    // Method to find length of string without using length()
    public static int findLength(String text) {
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
    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndex = new int[wordCount + 1];
        int index = 0;
        spaceIndex[index++] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            // Compare each word character by character
            if (arr1[i].length() != arr2[i].length()) {
                return false;
            }
            for (int j = 0; j < arr1[i].length(); j++) {
                if (arr1[i].charAt(j) != arr2[i].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking full text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        // User-defined split
        String[] userSplit = splitUsingCharAt(text);
        // Built-in split
        String[] builtInSplit = text.split(" ");
        // Compare results
        boolean result = compareStringArrays(userSplit, builtInSplit);

        // Display words
        System.out.println("\nWords using charAt():");
        for (String word : userSplit) {
            System.out.println(word);
        }
        System.out.println("\nWords using split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both results equal? " + result);

        sc.close();
    }
}
