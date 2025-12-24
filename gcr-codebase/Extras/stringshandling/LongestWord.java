import java.util.*;
//Create a class LongestWord to find the longest word in the sentence
public class LongestWord {
    // Methods
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");   
        String longestWord = "";                 

        for (int i = 0; i < words.length; i++) { 
            if (words[i].length() > longestWord.length()) {               longestWord = words[i];          
            }
        }
        return longestWord;                      
    }
    //Calling Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String result = findLongestWord(input);

        //Dis[lay result
        System.out.println("Longest word: " + result);

        sc.close();
    }
}
