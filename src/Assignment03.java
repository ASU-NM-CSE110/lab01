/*CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 3
 * Author : Noah Mitrevski
 * Description : This program will tell whether or not you should buy, sell, or hold the shares you currently have
 */
import java.util.Scanner;
public class Assignment03 {
	public static void main(String[] args) {
		
		//declaring variables
		double currentShares, purchasePrice, marketPrice, availableFunds, totalBuyCost, numberOfSharesToBuy = 0;
		double perShareBuyValue, totalBuyValue, perShareSellValue, totalSellValue, numberOfSharesToSell;
		int transactionFee = 10; 
		Scanner Scan = new Scanner(System.in);
		
		//setting the script
		System.out.print("What are your current amount of shares: " );
		currentShares = Scan.nextDouble();
		
		System.out.print("What is the purchased price of the shares: $");
		purchasePrice = Scan.nextDouble();
		
		System.out.print("What is the market price: $" );
		marketPrice = Scan.nextDouble();
		
		System.out.print("What are your available funds : $");
		availableFunds = Scan.nextDouble();
		
		//doing the calculations
		totalBuyCost = 10 + marketPrice * numberOfSharesToBuy;
		numberOfSharesToBuy = Math.floor((availableFunds-transactionFee)/marketPrice);
		perShareBuyValue = purchasePrice - marketPrice;
		totalBuyValue = perShareBuyValue * numberOfSharesToBuy;
		perShareSellValue  = marketPrice - purchasePrice; 
		totalSellValue = perShareSellValue * currentShares;
		
		
		
		//Making the if statement that will tell us whether to buy sell or hold
		if(marketPrice < purchasePrice && availableFunds > transactionFee) {
			System.out.println("Buy " + numberOfSharesToBuy + " shares");
			
		}else if(purchasePrice < marketPrice && totalSellValue > transactionFee) {
			System.out.println("Sell " + currentShares + " shares");
			
		}else
			System.out.println("Hold Shares");
		Scan.close(); // close the scanner
	}
}
/* Output : What are your current amount of shares: 10
			What is the purchased price of the shares: $1
			What is the market price: $3
			What are your available funds : $30
			Sell 10.0 shares
*/