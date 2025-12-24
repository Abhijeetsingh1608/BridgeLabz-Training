import java.util.*;
//Create a class  MostFrequentCharacter
public class MostFrequentCharacter {
    // Methods
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int maxCount = 0;
        char result = '\0';

        // Find character with maximum frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                result = ch;
            }
        }

        return result;
    }
    //Calling Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequent = findMostFrequentChar(input);

        System.out.println("Most frequent character: " + mostFrequent);

        sc.close();
    }
}
