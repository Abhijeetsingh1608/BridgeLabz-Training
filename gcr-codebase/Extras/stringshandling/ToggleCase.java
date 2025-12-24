import java.util.*;
//Create a class ToggleCase
public class ToggleCase {
    // Methods
    public static String toggleCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {          // Uppercase check
                result = result + (char)(ch + 32);
            } 
            else if (ch >= 'a' && ch <= 'z') {     // Lowercase check
                result = result + (char)(ch - 32);
            } 
            else {                                 // Other characters
                result = result + ch;
            }
        }
        return result;
    }
	//Calling Main Method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String output = toggleCase(input);
		
        //Display reult
        System.out.println("Toggled string: " + output);

        sc.close();
    }
}
