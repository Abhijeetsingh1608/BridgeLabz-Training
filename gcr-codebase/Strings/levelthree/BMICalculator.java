import java.util.*;
//Create a class BMICalculator to calculate BMI
public class BMICalculator {
    // Methods
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }
    public static String[][] processData(double[][] input) {
        return calculateBMIAndStatus(input);
    }
    public static void display(String[][] data) {
        System.out.println("------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                data[i][0] + " " +
                data[i][1] + " " +
                data[i][2] + " " +
                data[i][3]
            );
        }
    }

    // Main
    public static void main(String[] args) {
		//Create a 	Scanner object
        Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            input[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            input[i][1] = sc.nextDouble();
        }

        String[][] result = processData(input);
        display(result);
    }
}