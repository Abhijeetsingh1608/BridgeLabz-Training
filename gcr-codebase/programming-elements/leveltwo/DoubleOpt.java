import java.util.Scanner;

//Create a class DoubleOpt to perform double operations
public class DoubleOpt {
    public static void main(String[] args) {
	    //Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Read double inputs
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        // Double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        // Display Output
        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", and " + result3
        );

        input.close();
    }
}
