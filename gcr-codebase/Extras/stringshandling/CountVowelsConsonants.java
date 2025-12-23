import java.util.*;
//Create a class CountVowelsConsonants to count vowels and consonants
public class CountVowelsConsonants {
 public static void countVowelsAndConsonants(String text){
	 int vowels=0;
	 int consonants=0;
	
	 text=text.toLowerCase();
	 for(int i=0;i<text.length();i++){
		 char ch=text.charAt(i);
		  if (ch >= 'a' && ch <= 'z') {
                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        // Display result
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }
    // Main method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        countVowelsAndConsonants(input);

        sc.close();
    }
}
		 
	 
	 