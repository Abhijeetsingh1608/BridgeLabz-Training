import java.util.Scanner;
//Create a class LargestCheck to check the largest number
public class LargestCheck{
    public static void main(String[]args){
	
	//Create a Scanner object
	Scanner sc=new Scanner(System.in);
	//Input
	System.out.print("Enter first number: ");
	int number1=sc.nextInt();
	System.out.print("Enter second number: ");
    int number2 = sc.nextInt();
    System.out.print("Enter third number : ");
    int number3 = sc.nextInt();
    //Checking for largest number
	 if (number1 >= number2 && number1 >= number3) {
        System.out.println("Is the first number the largest? Yes");
     } else {
        System.out.println("Is the first number the largest? No");
        }
     if (number2 >= number1 && number2 >= number3) {
        System.out.println("Is the second number the largest? Yes");
     } else {
        System.out.println("Is the second number the largest? No");
        }
     if (number3 >= number1 && number3 >= number2) {
            System.out.println("Is the third number the largest? Yes");
     } else {
        System.out.println("Is the third number the largest? No");
        }

        sc.close();
    }
}