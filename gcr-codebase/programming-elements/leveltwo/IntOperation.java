import java.util.Scanner;

//Create a class IntOperation to perform integer operations and understand operator precedence
public class IntOperation {
    public static void main(String[] args) {
	
	    //Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Read input values
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // Integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;

        // Display the result
        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", and " + result3
        );

        input.close();
    }
}
