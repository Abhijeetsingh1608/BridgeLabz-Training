import java.util.*;
//Create a class  MaximumHandshakes to calculate max no. of handshakes
public class MaximumHandshakes{
    public static void main(String[]args){
	
	//Create a scanner object
	Scanner sc=new Scanner(System.in);
	//Creating the object
	MaximumHandshakes HS = new MaximumHandshakes();
	//Taking input variable from user
	System.out.print("Enter the no. of students:");
	int numberOfStudents=sc.nextInt();
	HS.maximumHandshakesCalculation( numberOfStudents);
	}
	//Creating the method 
	void maximumHandshakesCalculation(int numberOfStudents){
	int numberOfHandshake=((numberOfStudents*(numberOfStudents-1))/2);
	System.out.println("The number of possible handshakes is "+ numberOfStudents);
	}
}