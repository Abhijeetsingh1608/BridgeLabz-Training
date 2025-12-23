import java.util.*;
//Create a class PalindromeCheck to check the palindrome of the string
public class PalindromeCheck{
	//Methods
	public static boolean checkPalindrome(String text){

		int length=text.length();
		for(int i=0;i<length/2;i++){
			if(text.charAt(i)!=text.charAt(length-1-i)){
				return false;
		}
	}
	return true;
	}
	
	//Calling Main method
	public static void main(String[]args){
		//Create a Scanner object 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String input=sc.nextLine();
		 boolean result= checkPalindrome(input);
		 
		 //Display result
		 if(result){
			 System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
			 
		 sc.close();
}
}
