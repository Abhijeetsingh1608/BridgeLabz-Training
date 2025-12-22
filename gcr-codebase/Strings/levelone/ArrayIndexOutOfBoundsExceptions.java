import java.util.*;
// Create a class ArrayIndexOutOfBoundsExceptions
public class ArrayIndexOutOfBoundsExceptions{
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }
    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught and handled.");
        } catch (RuntimeException e) {
            // Handling any other runtime exception
            System.out.println("Generic RuntimeException caught.");
        }
    }
    // Main method
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Taking array size input
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        // Declaring array
        String[] names = new String[n];
        // Taking names input
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        // Calling method to generate exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated.");
        }

        // Calling method to handle the RuntimeException
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);

        sc.close();
    }
}
