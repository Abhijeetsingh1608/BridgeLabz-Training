import java.util.Scanner;
//Create a class LeapYearSingleIf to Check year is leap year or not
public class LeapYearSingleIf {
    public static void main(String[] args) {
	
	    //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // Ensure the year is within Gregorian calendar range
        if (year >= 1582) {
        // Check leap year using a single condition:
        // Divisible by 4 AND not divisible by 100
        // OR divisible by 400
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
               System.out.println(year + " is a Leap Year");
        } else {
               System.out.println(year + " is not a Leap Year");
           }
        } else {
            System.out.println("Leap Year program works only for year >= 1582");
        }
        sc.close();
    }
}
