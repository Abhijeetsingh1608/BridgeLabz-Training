import java.util.*;
//Create a class BMICalculation to calculate the BMI and display
public class BMICalculation {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // number of person
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        // Arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weightin (kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (m): ");
            height[i] = input.nextDouble();
        }
        //Calculating BMI 
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        //Display result
		for (int i = 0; i < n; i++) {
            System.out.printf(height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}