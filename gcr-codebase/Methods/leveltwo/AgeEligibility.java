import java.util.*;
//Create a class AgeEligibility to check the eligibility for vote
public class AgeEligibility{
	//Creating method
	public static boolean studentCanVote(int age){
		if(age >= 18){
			return true;
		}
		return false;
	}
	// calling main
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		// array
		int[] arr = new int[10];
		// taking loop
		for(int i = 0; i < 10; i++){
			System.out.print("Enter age : ");
			arr[i] = input.nextInt();
			if(AgeEligibility.studentCanVote(arr[i]) == true){
				System.out.println("TRUE");
			}
			else{
				System.out.println("FALSE");
			}
		}
		
		// display
		//for(int i = 0; i < 10; i++){
		//	if(ValidAge.studentCanVote(arr[i]) == true){
		//		System.out.println("TRUE");
		//	}
		//	else{
		//		System.out.println("FALSE");
		//	}
		//}
		
		input.close();
	}
}