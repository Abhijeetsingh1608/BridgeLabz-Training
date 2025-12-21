import java.util.*;
//Create a class SumOfNaturals to find the sum of n natural numbers 
public class SumOfNaturals {
	//declaring the method
	public int sumOfNaturalNumbers(int n){
		int sum=0;
		//Loop from 1 to natural
		for(int i=1;i<=n;i++){
			sum=sum+i;
	}
	return sum;
    }																																																						//perimeter of triangle

    public static void main(String[]args){
	//Create a scanner object
	Scanner sc=new Scanner(System.in);
	//Creating an object 
	SumOfNaturals sn=new SumOfNaturals();
	//Taking input variable from user
	System.out.print("Enter number:");
	int n=sc.nextInt();
	//Calling the method ;
	int result =sn.sumOfNaturalNumbers(n);
	
    //Display result 
     System.out.println("The sum of "+ n +" natural numbers is "+ result);
        

}
}