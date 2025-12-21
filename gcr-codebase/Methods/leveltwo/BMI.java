import java.util.*;
//Create a class BMI to calculate Body mass index
public class BMI{
    //Declaring Method
	public static String statusBMI(double bmi){
		if (bmi < 18.5) {
            return "Underweight";
        } 
		else if (bmi < 25) {
           return "Normal weight";
        } 
		else if (bmi < 30) {
          return "Overweight";
        } 
		else {
                return "Obese";
        }
	}
	
	public static void main(String args[]){
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
        //Number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();
        //2D array and status array
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            double weight = input.nextDouble();
            System.out.print("Enter height (m): ");
            double height = input.nextDouble();

            // Validation
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--; // repeat same person
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }
        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
			weightStatus[i] = BMI.statusBMI(bmi);
		}
		for(int i = 0; i < number; i++){
					System.out.println(
						personData[i][0] + " " +
						personData[i][1] + " " +
						personData[i][2] + " " +
						weightStatus[i]
    );
}

	}
}