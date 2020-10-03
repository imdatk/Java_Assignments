package assignments.repl;
import java.util.*;

public class Task037_VideoGameCoupons {

	public static void main(String[] args) {
//		The video game machines at your local arcade output coupons according to how well you play the game. 
//		You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. 
//		You prefer candy bars to gumballs. 
///		Write a program that defines a variable initially assigned to the number of coupons you win.
//		Next, the program should output how many candy bars and gumballs you can get if
//		you spend all of your coupons on candy bars first, and any remaining coupons on gumballs.
//
//		if you the coupons are not enough for any redeem, display the message:
//		"Not enough coupons"
//		
//			Example1:
//
//				Display prompt: "Enter number of coupons:"
//				13
//				Display prompt: "Number of Candies: 1"
//				Display prompt: "Number of Gumballs: 1"
//
//				Example2:
//
//				Display prompt: "Enter number of coupons:"
//				23
//				Display prompt: "Number of Candies: 2"
//				Display prompt: "Number of Gumballs: 1"
//
//				Example3:
//
//				Display prompt: "Enter number of coupons:"
//				2
//				Display prompt: "Not enough coupons"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Coupons");
		int couponsWon = scan.nextInt();
		if (couponsWon >=10) {
			int numberOfCandies = couponsWon/10;
			System.out.println("Number of Candies: " + numberOfCandies);
			if(couponsWon%10 >=3){
				int numberOfGumballs = couponsWon%10/3; 
				System.out.println("Number of Gumballs: "+ numberOfGumballs);
			}  // else {}
		}
		else if(couponsWon>=3 && couponsWon<10) {
			
			int numberOfGumballs = couponsWon/3; 
			System.out.println("Number of Gumballs: "+ numberOfGumballs);
		}
		else {
			System.out.println("Not enough coupons");
		}

	}

}
