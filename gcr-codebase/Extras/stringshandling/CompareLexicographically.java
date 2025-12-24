import java.util.*;
//Create a class CompareLexicographically to compare two strings
public class CompareLexicographically {
    // Methods
    public static int compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 != ch2) {
                return ch1 - ch2; 
            }
        }
        return s1.length() - s2.length();
    }
    //Calling Main Method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);
		
        //Display result
        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println("First string comes before second string");
        } else {
            System.out.println("First string comes after second string");
        }

        sc.close();
    }
}
