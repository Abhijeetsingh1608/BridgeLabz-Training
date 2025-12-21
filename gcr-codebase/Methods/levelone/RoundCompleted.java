import java.util.*;
//Create a class RoundsCompleted to calculate no. of rounds completed
public class RoundsCompleted {
	public static double calculateRounds(double side1,double side2,double side3){
    //perimeter of triangle
	double perimeter=side1+side2+side3;
	double totalDistance=5000;
	//Calculate no. of rounds
	double rounds=totalDistance/perimeter;
	return rounds;
	}
    public static void main(String[]args){
	//Create a scanner object
	Scanner sc=new Scanner(System.in);
	
	//Taking input variable from user
	System.out.print("Enter Side1(meters):");
	double side1=sc.nextDouble();
	System.out.print("Enter Side2 (meters):");
	double side2=sc.nextDouble();
	System.out.print("Enter Side3 (meters):");
	double side3=sc.nextDouble();
	//Calling the method 
	double rounds=calculateRounds(side1,side2,side3);
	System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km.");

}
}