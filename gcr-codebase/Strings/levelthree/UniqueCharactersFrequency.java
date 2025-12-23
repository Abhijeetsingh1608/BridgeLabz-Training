import java.util.Scanner;
//Create a class UniqueCharactersFrequency to count frquency of characters using unique
public class UniqueCharactersFrequency {
    // Methods
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        // Count frequency of all characters
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        // Store character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = findFrequency(input);
        System.out.println("Character  Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "          " + result[i][1]);
        }

        sc.close();
    }
}
