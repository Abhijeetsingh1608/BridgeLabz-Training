import java.util.*;
//Create a class RemoveCharacter to remove all occurences of a specific character
public class RemoveCharacter {
    // Methods
    public static String removeChar(String text, char ch) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch) {
                result = result + text.charAt(i);
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
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        String output = removeChar(input, ch);
        
		//Display result
        System.out.println("String after removing '" + ch + "': " + output);

        sc.close();
    }
}

    