package assignments.repl;

import java.util.Scanner;

public class Task035_GiftCard {

	public static void main(String[] args) {
		
//		 Let's say I've got a 100$ gift card and you want to buy something in your online store . 
//		 Write a program that will help me to buy something and display leftover balance after purchase. 
//		 If item is not in the list, display message: "Invalid item!". If price is more than 100$, 
//		 display message: "Sorry, not enough funds on your gift card!".
		
//	    Hint
//	    Use if/ else if / else
//	    CODE EXAMPLE:
//	    Example #1
//	    input: Hat
//	    output: Thank you for your purchase!
//	    output: Your current balance is: 75$
//
//	    Example #2
//	    input: Pants
//	    output: Thank you for your purchase!
//	    output: Your current balance is: 50$
//
//	    Example #3
//	    input: Laptop
//	    output: Sorry, not enough funds on your gift card!
//
//	    Example #4
//	    input: Cupcake
//	    output: Invalid item!
		
			Scanner scan = new Scanner(System.in);
			
			final int giftCard =100;
			int price = 0;
			String item = scan.nextLine();
			if (item.equals("Smartphone") || item.equals("smartphone")){
				price = 300;}
			else if (item.equals("Laptop") || item.equals("laptop")){
				price = 400;}
			else if (item.equals("Charger") || item.equals("charger")){
				price = 15;}
			else if (item.equals("USB Cable") || item.equals("USB cable")){
				price = 10;}
			else if (item.equals("Headphone") || item.equals("headphone")){
				price = 30;}
			else if (item.equals("Pant") || item.equals("pant")){
				price = 50;}
			else if (item.equals("Hat") || item.equals("hat")){
				price = 25;}
			else if (item.equals("Sock") || item.equals("sock")){
				price =5;}
			else if (item.equals("Blanket") || item.equals("blanket")){
				price = 60;}
			else if (item.equals("Pillow") || item.equals("pillow")){
				price = 40;}
			if (price > 100){System.out.println("Sorry, not enough funds on your gift card!");}
			else if (price == 0) {System.out.println("Invalid item!");}
			else {
			int leftBalance = giftCard - price;
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+ leftBalance);
						
			}
			
		
	}
}
