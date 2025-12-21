import java.util.*;
//Create a class SumOfNaturals to calculate the sum of naturals
public class SumOfNaturals{
    //Declaring method
	public static int sumofnumsrecursion(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n + sumofnumsrecursion(n-1);
		}
	}

	public static int sumofnumiteration(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
	// Calling main
	public static void main(String args[]){
		//Create a Scanner object
		Scanner sc = new Scanner(System.in);
		// taking input
		System.out.print("Enter number : ");
		int n =sc.nextInt();
		
		// calling methods
		int sum1 = SumOfNaturals.sumofnumsrecursion(n);
		int sum2 = SumOfNaturals.sumofnumiteration(n);
		
		System.out.print(sum1 + " " + sum2);
		
		sc.close();
	}
}