import java.util.Scanner;
// Create a class TrigonometricFunctionsCalculator
public class TrigonometricFunctionsCalculator {
    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        // Convert angle from degrees to radians
        double angleInRadians = Math.toRadians(angleInDegrees);
        // Calculate sine, cosine, tangent
        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);
        return new double[]{sinValue, cosValue, tanValue};
    }
    // Main method
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        // Call the method
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine(" + angle + "°) = " + results[0]);
        System.out.println("Cosine(" + angle + "°) = " + results[1]);
        System.out.println("Tangent(" + angle + "°) = " + results[2]);

        sc.close();
    }
}
