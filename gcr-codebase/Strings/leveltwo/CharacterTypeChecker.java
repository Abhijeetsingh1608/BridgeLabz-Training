import java.util.Scanner;
//Create a class CharacterTypeChecker to check character types
public class CharacterTypeChecker {
    // Method to check whether a character is Vowel, Consonant, or Not a Letter
    public static String checkCharacter(char ch) {
        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        // If not a letter
        return "Not a Letter";
    }
    // Method to find vowels and consonants using charAt() and return 2D array
    public static String[][] getCharacterTypes(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void display2DArray(String[][] array) {

        System.out.println("\nCharacter\tType");
        System.out.println("-----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter the String: ");
        String text = sc.nextLine();
        // Get character types
        String[][] charTypes = getCharacterTypes(text);

        // Display results
        display2DArray(charTypes);
        sc.close();
    }
}
