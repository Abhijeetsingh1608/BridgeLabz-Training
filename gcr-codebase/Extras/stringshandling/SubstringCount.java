import java.util.*;
//Create a class SubstringCount to count substring
public class SubstringCount {
    // Methods
    public static int countSubstring(String text, String sub) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }
        return count;
    }
    //Calling Main Method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = sc.nextLine();
        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int result = countSubstring(text, sub);

        //Display result
        System.out.println("Substring occurs " + result + " times.");

        sc.close();
    }
}
