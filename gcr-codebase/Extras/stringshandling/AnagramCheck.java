import java.util.*;
//Create a class AnagramCheck to check anagram
public class AnagramCheck {
    // Methods
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[256]; 
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq[ch]--;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
    //Calling Main Method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);

        //Display result
        if (result) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }

        sc.close();
    }
}
