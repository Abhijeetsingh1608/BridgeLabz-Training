import java.util.*;
//Create a class PalindromeCheck
public class PalindromeCheck{
	// methods
	public static boolean ispalindrom(String str){
		int s = 0, end = str.length() - 1;
		while(s < end){
			if(str.charAt(s) != str.charAt(end)){
				return false;
			}
			s++;
			end--;
		}
		return true;
	}
	
	// main
	public static void main(String args[]){
		
		String str = "abcba";
		
		System.out.print(ispalindrom(str));
	}
}