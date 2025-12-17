//Creating SamAverageMarks as a class
public class SamAverageMarks{
public static void main(String[]args){

//Creating Variables mathsMarks,physicsMarks,chemistryMarks
int mathsMarks=94;
int physicsMarks=95;
int chemistryMarks=100;
//Calculating total marks and the average percentage
int totalMarks=(mathsMarks+physicsMarks+chemistryMarks);
//Creating a variable averagePercent
double averagePercent=totalMarks/3.0;

//Display the result
System.out.println("Sam's average mark in PCM is " + averagePercent);
}
}
