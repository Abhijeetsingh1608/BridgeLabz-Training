import java.util.*;
//Create a class CheckNumber to check the number 
public class CheckNumber {
	//declaring the method
	public int checknum(int number){
		if(number>0){return 1;
		}else if(number==0){return 0;
	}else{
		return -1;
	}
    }																																																						//perimeter of triangle

    public static void main(String[]args){
	//Create a scanner object
	Scanner sc=new Scanner(System.in);
	//Creating an object 
	CheckNumber cn=new CheckNumber();
	//Taking input variable from user
	System.out.print("Enter number:");
	int number=sc.nextInt();
	//Calling the method ;
	int result =cn.checknum(number);
    //Display result 
	if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == 0) {
            System.out.println("The number is Zero");
        } else {
            System.out.println("The number is Negative");
        }

}
}