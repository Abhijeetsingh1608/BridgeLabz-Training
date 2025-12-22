import java.util.*;
//Create a class ShortestAndLongestWord to find the shortest and longest word
public class ShortestAndLongestWord {
    // Method to find length of a string without using length()
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
        int idx = 0;
        spaceIndex[idx++] = -1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = length;
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

    // Method to create 2D array of word and its length
    public static String[][] getWordsWithLengths(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestAndLongest(String[][] wordsWithLength) {
        int shortestIndex = 0;
        int longestIndex = 0;

        int minLength = Integer.parseInt(wordsWithLength[0][1]);
        int maxLength = Integer.parseInt(wordsWithLength[0][1]);

        for (int i = 1; i < wordsWithLength.length; i++) {
            int length = Integer.parseInt(wordsWithLength[i][1]);

            if (length < minLength) {
                minLength = length;
                shortestIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking full text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        // Split text into words
        String[] words = splitUsingCharAt(text);
        // Create 2D array of words and lengths
        String[][] wordsWithLength = getWordsWithLengths(words);
        // Find shortest and longest word
        int[] result = findShortestAndLongest(wordsWithLength);

        // Display results
        System.out.println("\nWords and their lengths:");
        System.out.println("Word\t\tLength");
        System.out.println("-----------------------");

        for (int i = 0; i < wordsWithLength.length; i++) {
            int len = Integer.parseInt(wordsWithLength[i][1]);
            System.out.println(wordsWithLength[i][0] + "\t\t" + len);
        }
        System.out.println("\nShortest Word: " + wordsWithLength[result[0]][0]);
        System.out.println("Longest Word : " + wordsWithLength[result[1]][0]);

        sc.close();
    }
}
