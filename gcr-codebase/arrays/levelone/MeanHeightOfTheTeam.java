import java.util.Scanner;
//Create a class MeanHeightOfTeam to find the mean height of team
public class MeanHeightOfTeam {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner sc = new Scanner(System.in);
        // Create a double array to store heights of 11 football players
        double[] heights = new double[11];
        // Variable to store the sum of all heights
        double sum = 0.0;
        // Take input for each player's height
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }
        // Calculate the sum of all elements in the array
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Display the mean height of the football team
        System.out.println("Mean height of the football team is: " + meanHeight);

        sc.close();
    }
}
