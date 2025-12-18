import java.util.Scanner;

//Create a class TriangleArea to calculate the area of triangle
public class TriangleArea {
    public static void main(String[] args) {
		 
	    //Create a Scanner Object
        Scanner input = new Scanner(System.in);
     
        // Take base and height in inches
        double base = input.nextDouble();
        double height = input.nextDouble();
        // Area in square inches
        double areaInSqInches = 0.5 * base * height;
        // Convert square inches to square centimeters
        // 1 inch = 2.54 cm , 1 sq inch = 2.54 * 2.54 sq cm
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;
        //Display the result
        System.out.println(
            "The area of the triangle in square inches is " + areaInSqInches +
            " and in square centimeters is " + areaInSqCm);

        input.close();
    }
}
