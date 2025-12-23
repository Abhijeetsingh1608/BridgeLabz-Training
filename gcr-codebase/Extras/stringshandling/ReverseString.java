import java.util.*;
//Create a class ReverseString to reverse the string
public class ReverseString{
	//Methods
	public static String reverseTheString(String text){
		String reversed="";
		for(int i=text.length()-1;i>=0;i--){
			reversed+=text.charAt(i);
		}
		return reversed;
	}
	//Calling Main method
	public static void main(String[]args){
		//Create a Scanner object 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String input=sc.nextLine();
		 String result=reverseTheString(input);
		 
		 //Display result
		 System.out.println("Reversed String:" + result);
		 
		 sc.close();
}
}
