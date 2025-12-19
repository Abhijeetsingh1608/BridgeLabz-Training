import java .util.*;
//	Create a class SpringSeason to check whether the season is spring or not 
public class SpringSeason {
    public static void main(String[] args) {

        // Convert command line arguments to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        // Check if the date falls between March 20 and June 20
        if ((month == 3 && day >= 20) ||    // March 20 to March 31
            (month == 4) ||                 // April (all days)
            (month == 5) ||                 // May (all days)
            (month == 6 && day <= 20)) {    // June 1 to June 20

            // If condition is true, it is Spring Season
            System.out.println("Its a Spring Season");
        } else {
            // Otherwise, it is not Spring Season
            System.out.println("Not a Spring Season");
        }
    }
}
