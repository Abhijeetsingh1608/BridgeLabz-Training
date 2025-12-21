import java.util.*;
//Create a class Youngesttallest to find the youngest and tallest
public class Youngesttallest{
    //Declaring Method
	public static int tallest(int[] height){
		int tallest = height[0];
		for(int i = 0; i < 3; i++){
			if(height[i] > tallest){
				tallest = height[i];
			}
		}
		return tallest;
	}
	public static int youngest(int[] age){
		int youngest = age[0];
		for(int i = 0; i < 3; i++){
			if(age[i] < youngest){
				youngest = age[i];
			}
		}
		return youngest;
	}
	//Calling main
	public static void main(String args[]){
		//Create a Scanner object
		Scanner sc = new Scanner(System.in);
		// declaring arrays
		int[] height = new int[3];
		int[] age = new int[3];
		// taking input
		for(int i = 0; i < 3; i++){
			System.out.print("Enter age for : "  + i);
			int a = sc.nextInt();
			System.out.print("Enter height for : " + i);
			int h = sc.nextInt();
			
			height[i] = h;
			age[i]= a;
			
		}
		// finding youngest and tallest
		int youngest = Youngesttallest.youngest(age);
		int tallest  = Youngesttallest.tallest(height);
		
		//display result
		System.out.println(youngest);
		System.out.println(tallest);
		
		sc.close();
	}	
}