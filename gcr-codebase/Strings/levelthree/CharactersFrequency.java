import java.util.*;
//Create a calss CharactersFrequency to find the frquency of characters 
public class CharactersFrequency {
    // Methods
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII characters
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark visited
            }
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] < 0) freq[i] = -freq[i];
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // avoid duplicates
                index++;
            }
        }

        return result;
    }

    public static void display(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);
        display(result);
    }
}