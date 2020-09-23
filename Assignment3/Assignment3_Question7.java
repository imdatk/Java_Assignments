package assignments.day04;

public class Assignment3_Question7 {

	public static void main(String[] args) {
		/* Write a program that determines the change to be dispensed from a vending machine. 
		 * An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
		 * and the machine accepts only a single dollar bill to pay for the item.
		 * Sample output:
		 * 	Price in cents : 95
		 * 	Your change is 0 quarters, 0 dimes, and 1 nickles */
		int price, change;
		final int bill = 100;
		price = 35;
		change = bill - price;
		int quarters = change/25;
		int nickles = ((change - quarters * 25)%10)/5;
		int dimes = ((change-quarters*25)-((change - quarters * 25)%10))/10;
		
		System.out.println("Price in cents: " + price);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickles + " nickles");
		
		

      

	}

}
