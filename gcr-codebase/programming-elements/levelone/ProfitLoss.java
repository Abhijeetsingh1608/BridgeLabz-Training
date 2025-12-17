//Create a class profitLoss to calculate Profit and Profit Percentage
public class ProfitLoss{
   public static void main(String[]args){
   
  //Create variables costPrice and SellingPrice
  double costPrice=129;
  double sellingPrice=191;
  //Calculate profit
  double profit=sellingPrice-costPrice;
  //Calculate profit percentage
  double profitPercentage=(profit/costPrice)*100;
  
  //Display result
  System.out.println(
  "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
  "The Profit is INR " + profit + " and the profitPercentage is " + profitPercentage
        );
    }
}
