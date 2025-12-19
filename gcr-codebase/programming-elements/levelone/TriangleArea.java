import java.util.Scanner;
//Create a class TriangleArea to calculate the area of triangle
public class TriangleArea {
    public static void main(String[] args) {
		
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input base and height
        double base = input.nextDouble();
        double height = input.nextDouble();
        // Calculate area in square inches
        double areaSqInches = 0.5 * base * height;
        // Convert square inches to square centimeters
        double areaSqCm = areaSqInches * 2.54 * 2.54;

        //Display result
        System.out.println(
            "Your Height in cm is " + areaSqCm +
            " while in feet is " + areaSqInches +
            " and inches is " + areaSqInches
        );

        input.close();
    }
}
