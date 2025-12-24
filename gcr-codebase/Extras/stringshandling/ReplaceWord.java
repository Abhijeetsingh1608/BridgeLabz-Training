import java.util*;
//Create a class ReplaceWord to replace the word in a sentence
public class ReplaceWord {
    //Methods
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result = result + newWord;
            } else {
                result = result + words[i];
            }

            if (i < words.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }
    //Calling Main Method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter new word: ");
        String newWord = sc.next();
        String output = replaceWord(sentence, oldWord, newWord);
        
		//Display result
        System.out.println("Updated sentence: " + output);

        sc.close();
    }
}
