import java.util.*;
//Create a class RemainderAndQuotient to find the remainder and quotient 
public class RemainderAndQuotient{
	//declaring the method
public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient=number/divisor;
		int remainder=number%divisor;
        //store results in array
		int[] result=new int[2];
		result[0]=quotient;
		result[1]=remainder;
		return result;
	}
	
    public static void main(String[]args){
	//Create a scanner object
	Scanner sc=new Scanner(System.in);
	//Creating an object 
	RemainderAndQuotient RQ=new RemainderAndQuotient();
	//Taking input variable from user
	System.out.print("Enter number:");
	int number=sc.nextInt();
	System.out.print("Enter divisor:");
	int divisor=sc.nextInt();
	//Calling the method ;
	int[] result =RQ.findRemainderAndQuotient(number,divisor);
	 // Display output
    System.out.println("Quotient = " + result[0]);
    System.out.println("Remainder = " + result[1]);
    
	sc.close();

}
}