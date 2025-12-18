import java.util.Scanner;
//Create a class  SmallestCheck to check the first number
public class SmallestCheck{
    public static void main(String[]args){
	
	 //Create a Scanner object 
	 Scanner input=new Scanner(System.in);
	 //	Input
	 System.out.print("Enter first number: ");
	 int number1=input.nextInt();
	 System.out.print("Enter second number: ");
     int number2 = input.nextInt();
     System.out.print("Enter third number: ");
     int number3 = input.nextInt();
	 
	 //Checking number1
	 if (number1 < number2 && number1 < number3) {
       System.out.println("Is the first number the smallest? Yes");
     } else {
       System.out.println("Is the first number the smallest? No");
        }
	  input.close();
	  }
	  }