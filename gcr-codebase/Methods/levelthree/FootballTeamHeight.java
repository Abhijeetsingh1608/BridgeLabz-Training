import java.util.*;
// Create a class FootballTeamHeight to calculate the height 
public class FootballTeamHeight {
    //Creating Methods
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150 to 250
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) {
            if (h < shortest) {
                shortest = h;
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) {
            if (h > tallest) {
                tallest = h;
            }
        }
        return tallest;
    }
    //Calling Main
    public static void main(String[] args) {
        // Create array of size 11 for players
        int[] heights = generateHeights(11);
        // Display heights
        System.out.println("Heights of Football Players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        // Calculate results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("Sum of heights = " + sum);
        System.out.println("Mean height = " + mean);
        System.out.println("Shortest height = " + shortest);
        System.out.println("Tallest height = " + tallest);
    }
}
