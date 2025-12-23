import java.util.*;
//Create a class RemoveDuplicates to remove the duplicate characters
public class RemoveDuplicates {
    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Agar character pehle se result me nahi hai
            if (result.indexOf(currentChar) == -1) {
                result = result + currentChar;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String output = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + output);

        sc.close();
    }
}
