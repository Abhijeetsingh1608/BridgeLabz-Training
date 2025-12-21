import java.util.*;
//Create a class LeapYear to find the leap year
public class LeapYear{
	
	// method declaration
	public static boolean isleapyear(int year){
    // checking conditions
		if(year >= 1582){
			if(year%400 == 0){
				return true;
			}
			else if(year%4 ==0 && year%100 != 0){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	// Calling main 
	public static void main(String args[]){
		//Creatingscanner class object
		Scanner sc = new Scanner(System.in);
	    // declaring leap year varible and taking user input
		System.out.print("Enter year : ");
		int leapyear = sc.nextInt();
		System.out.print(LeapYear.isleapyear(leapyear));
		
		sc.close();
	}	
}