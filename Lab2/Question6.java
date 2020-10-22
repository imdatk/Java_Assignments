package assignments.Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
//		Write a program that will ask the user to enter the amount of a purchase. 
//		The program should then compute the state and county tax sales tax. 
//		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
//		The program should display the amount of the purchase , the state sales tax, 
//		the county sales tax, the total sales tax, and the total of the sale 
//		(which is the sum of the amount of purchase plus the total sales tax)

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of purchase: ");
		double amountOfPurchase = scan.nextDouble();
		double stateSalesTax = amountOfPurchase*0.04;
		double countySalesTax = amountOfPurchase*0.02;
		double totalSalesTax = stateSalesTax + countySalesTax;
		double totalPrice = amountOfPurchase + totalSalesTax;
		
		System.out.println("Amount of Purchase: " + amountOfPurchase);
		System.out.println("State Sales Tax   : " + stateSalesTax);
		System.out.println("County Sales Tax  : " + countySalesTax);
		System.out.println("Total Sales Tax   : " + totalSalesTax);
		System.out.println("Total Price       : " + totalPrice);
		
	}

}
