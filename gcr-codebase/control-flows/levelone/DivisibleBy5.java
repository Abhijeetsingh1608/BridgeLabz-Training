import java.util.Scanner;
//Create a class DivisibleBy5 to check the divisibility
public class DivisibleBy5{
    public static void main(String[]args){
	
	 //Create a Scanner object 
	 Scanner input=new Scanner(System.in);
	 System.out.print("Enter a num: ");
	 int num=input.nextInt();
	 //Checking divisibility
	 if(num%5==0){
	 System.out.println("Is the number" + num +"divisibleby 5? yes");
	 }else{
	  System.out.println("Is the number" + num +"divisibleby 5? No");
	  }
	  input.close();
	  }
	  }