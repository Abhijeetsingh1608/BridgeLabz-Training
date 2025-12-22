import java.util.Scanner;
//Create a class SplitTexttWords2D
public class SplitTexttWords2D{
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
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as String
        }
        return result;
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

        // Display result in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println(" ");
        for (int i = 0; i < wordsWithLength.length; i++) {
            int length = Integer.parseInt(wordsWithLength[i][1]);
            System.out.println(wordsWithLength[i][0] + "\t\t" + length);
        }
        sc.close();
    }
}
