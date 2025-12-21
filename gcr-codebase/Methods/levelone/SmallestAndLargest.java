import java.util.*;
//Create a class SmallestAndLargest to find the smallest and largest of 3 numbers 
public class SmallestAndLargest{
	//declaring the method
	public void findsmallestAndLargest(int number1,int number2,int number3){
		int smallest= number1;
		int largest=number1;
		//compare with second
		if(number2<smallest){
			smallest=number2;
		}
		if(number2>largest){
			largest=number2;
		}
		//Compare with third
		if(number3<smallest){
			smallest=number3;
	}
	    if(number3>largest){
			largest=number3;
		}
		//Display the result
		System.out.println("The smallest of three is "+smallest+" and largest is "+ largest);
	}
	
    public static void main(String[]args){
	//Create a scanner object
	Scanner sc=new Scanner(System.in);
	//Creating an object 
    SmallestAndLargest	sl=new SmallestAndLargest();
	//Taking input variable from user
	System.out.print("Enter number1:");
	int number1=sc.nextInt();
	System.out.print("Enter number2:");
	int number2=sc.nextInt();
	System.out.print("Enter number3:");
	int number3=sc.nextInt();
	//Calling the method ;
	sl.findsmallestAndLargest(number1,number2,number3);
	

}
}