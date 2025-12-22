import java.util.Scanner;
//Create a class CompareSubstring ta create a substring and compare them
class CompareSubstring {
    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        // Loop from start index to end index (end is exclusive)
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {

        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking string input
        System.out.print("Enter the String: ");
        String text = sc.next();
        // Taking start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Substring using charAt()
        String subCharAt = createSubstringUsingCharAt(text, start, end);
        // Substring using built-in method
        String subBuiltIn = text.substring(start, end);
        // Comparing both substrings
        boolean isSame = compareStringsUsingCharAt(subCharAt, subBuiltIn);

        // Displaying results
        System.out.println("\nSubstring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + isSame);

        sc.close();
    }
}
