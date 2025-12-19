import java.util.Scanner;
//Create a class LeapYearSingleIfCondition to Check year is leap year or not
public class LeapYearSingleIfCondition {
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
		// Leap Year logic with a single condition
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        } else {
            System.out.println("Leap Year program works only for year >= 1582");
        }
        sc.close();
    }
}
