import java.util.*;
//Create a class for AnagramCheck
public class AnagramCheck {
    // Methods
    public static boolean isAnagram(String text1, String text2) {
        // Checking length
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        // Find frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }
        // Find frequency of characters in second text
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }
        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
    // Main method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        if (result) {
            System.out.println("The given texts are anagrams");
        } else {
            System.out.println("The given texts are not anagrams");
        }

        sc.close();
    }
}
