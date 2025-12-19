import java.util.Scanner;
//Create a class YoungestAndTallestFriend to find which one is 
//tallest and youngest
public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);
        // Array to store friends' names
        String[] names = {"Amar", "Akbar", "Anthony"};
        // Arrays to store ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Take user input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        // Assume first friend is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;
        // Loop to find youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            // Check for youngest
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            // Checking for tallest
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);

        sc.close();
    }
}
