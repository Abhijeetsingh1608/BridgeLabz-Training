import java.util.Scanner;
//Create a class SumOfTheNaturalNumbers to find sum of n natural
//numbers and compare the result
public class SumOfTheNaturalNumbers {
    public static void main(String[] args) {
        
		//Create a Scanner object  
        Scanner sc = new Scanner(System.in);
        //Input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        //Check if n is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number");
        } else {
		// Sum using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
         sumFor = sumFor + i;
         }
        // Sum using formula
         int sumFormula = n * (n + 1) / 2;

        // Display results
            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula = " + sumFormula);
        // Compare both results
            if (sumFor == sumFormula) {
                System.out.println("Result is correct. Both values are equal.");
            } else {
                System.out.println("Result is incorrect. Values are not equal.");
            }
        }

        sc.close();
    }
}
