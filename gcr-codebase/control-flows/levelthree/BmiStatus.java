import java.util.Scanner;
//Create a class BmiStatus to check the BMI of a person
public class BmiStatus{
	public static void main(String [] args){
	
	    //Create a Scanner object
		Scanner sc=new Scanner(System.in);
		//Take weight and height as input
        System.out.println("Enter your weight in kg");
		double weight=sc.nextInt();
		System.out.println("Enter your height in cm");
		double height=sc.nextInt();
		// convert height in meters
		double heightInMeters=height/100;
		// calculate the BMI = weight / (height * height)
		double BMI=weight / (heightInMeters * heightInMeters);
		
		// Here, we'll be using if-else-if ladder to determine
        //status
		if(BMI >= 40){
			System.out.println("With " + BMI + " you are Obese");
		}else if(BMI >= 25.0 && BMI < 40){
			System.out.println("With " + BMI + " you are Overweight");
		}else if(BMI > 18.5 && BMI <25){
			System.out.println("With " + BMI + " you are Normal");
		}else{
             System.out.println("With " + BMI + " you are UnderWeight");		
		}
		
		sc.close();
	}
}