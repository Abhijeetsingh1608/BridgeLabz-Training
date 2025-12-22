import java.util.*;
//Create a class AgeEligibilityCheck to check age eligibility
public class AgeEligibilityCheck {
    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10; // 10 to 99
        }
        return ages;
    }
    // Method to check voting eligibility and return 2D array [age, canVote]
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false"; // negative age cannot vote
            } else if (age >= 18) {
                result[i][1] = "true"; // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }
        return result;
    }
    // Method to display 2D array in tabular format
    public static void display2DArray(String[][] array) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + "\t" + array[i][1]);
        }
    }
    // Main method
    public static void main(String[] args) {
        //Create a class Scanner object
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = new int[n];
        // Input ages for 10 students
        System.out.println("Enter ages of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }
        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display results
        display2DArray(eligibility);

        sc.close();
    }
}
