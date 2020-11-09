package Assignment8;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
//		c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
//		it returns a string value that can be "profit","loss","no loss"
//		for example:
//		c_profis(100,1500)
//		returns : "profit"
//		c_profis(20,5)
//		returns : "loss"
//		c_profis(100,100)
//		returns : "no loss"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter buying price: ");
		int buyPrice = scan.nextInt();
		System.out.println("Enter selling price: ");
		int sellPrice = scan.nextInt();
		c_profits(buyPrice, sellPrice);


	}

	private static void c_profits(int buyPrice, int sellPrice) {
		if (buyPrice<sellPrice) {
			System.out.println("profit");
		}else if (buyPrice>sellPrice) {
			System.out.println("loss");
		}else if (buyPrice==sellPrice) {
			System.out.println("no loss");
		}
		
	}

}
