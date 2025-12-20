import java.util.*;
//Create a class SimpleInterest to calculate the simple interest
public class SimpleInterest{
    public static void main(String[]args){
	
	//Create a scanner object
	Scanner sc=new Scanner(System.in);
	//Taking user input
	System.out.print("Enter principal Amount:");
	double principal=sc.nextDouble();
	System.out.print("Enter rate of interset:");
	double rate=sc.nextDouble();
	System.out.print("Enter time:");
	double time=sc.nextDouble();
	//Creating the object
	SimpleInterest SI=new SimpleInterest();
	SI.simpleInterestCalculator(principal,rate,time);
	}
	
	//Creating the method and displaying result
	void simpleInterestCalculator(double principal,double rate,double time){
	double simpleInterest=((principal*rate*time)/100);
	System.out.println("The Simple Interest is " + simpleInterest +"for principal" + principal +"for rate"+ rate +"for time"+time);
	}
	}
	