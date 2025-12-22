import java.util.*;
//Create a class EuclideanDistance to calculate the euclidean distance
public class EuclideanDistance{
    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        // distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return distance;
    }
    // Method to calculate slope and y-intercept
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        // Calculate slope m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        // Calculate y-intercept b = y1 - m * x1
        double b = y1 - m * x1;
        result[0] = m;
        result[1] = b;
        return result;
    }
    //Calling Main 
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Taking input for first point
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Taking input for second point
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);
        // Calculate equation of line
        double[] equation = lineEquation(x1, y1, x2, y2);
        System.out.println("Slope (m) = " + equation[0]);
        System.out.println("Y-intercept (b) = " + equation[1]);

        // Display line equation
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);

        input.close();
    }
}
