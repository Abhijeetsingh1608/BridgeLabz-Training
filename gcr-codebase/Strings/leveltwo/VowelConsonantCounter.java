import java.util.*;
//Create a class VowelConsonantCounter to count vowels and consonants
public class VowelConsonantCounter {
    // Method to check whether a character is Vowel, Consonant, or Not a Letter
    public static String checkCharacter(char ch) {
        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        // If not a letter
        return "Not a Letter";
    }

    public static int[] findVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter the String: ");
        String text = sc.nextLine();
        // Finding vowels and consonants
        int[] result = findVowelsAndConsonants(text);

        // Display results
        System.out.println("\nVowel Count      : " + result[0]);
        System.out.println("Consonant Count : " + result[1]);

        sc.close();
    }
}
