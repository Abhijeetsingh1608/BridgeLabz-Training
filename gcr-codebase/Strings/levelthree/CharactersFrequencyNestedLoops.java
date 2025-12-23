import java.util.*;
//Create a class CharactersFrequencyNestedLoops
public class CharactersFrequencyNestedLoops {
    // Methods
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        // Initialize frequency array
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
        }
        // Nested loops to count frequency
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }
        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Create 1D String array to store result
        String[] result = new String[uniqueCount * 2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = String.valueOf(chars[i]);
                result[index + 1] = String.valueOf(freq[i]);
                index += 2;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] result = findFrequency(input);
        System.out.println("Character  Frequency");
        for (int i = 0; i < result.length; i += 2) {
            System.out.println(result[i] + "          " + result[i + 1]);
        }

        sc.close();
    }
}
