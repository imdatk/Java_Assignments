package assignments.repl;

import java.util.*;

public class Task022_ShoppingList {

	public static void main(String[] args) {
//		-Create a Scanner object named scan.
//
//		Execution flow with example:
//
//		-Display prompt "Enter Item1 and its price:"
//		Tomatoes
//		5.5
//
//		-Display prompt "Enter Item2 and its price:"
//		Cheese
//		3.5
//
//		-Display prompt "Enter Item3 and its price:"
//		Apples
//		6.3
//
//		-calculate totalPrice for all items
//
//		-build the report variable by concatenating Strings and double values: 
//
//		"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
//		"Total price: 15.3"
//
//		- Print the value of report variable
		
		
		//WRITE YOUR CODE HERE:
	    String item1, item2, item3;
	    double price1, price2, price3, totalPrice;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter Item1 and its price.");
	    item1 = scan.next();
	    price1 =scan.nextInt();
	    
	    System.out.println("Enter Item2 and its price.");
	    item2 = scan.next();
	    price2 =scan.nextInt();
	    
	    System.out.println("Enter Item3 and its price.");
	    item3 = scan.next();
	    price3 =scan.nextInt();
	    
	    totalPrice = price1 + price2 + price3;
	    
	    System.out.println("Item1: "+item1+" Price: " +price1+", Item2: "+item2+" Price: " +price2
	                        +", Item3: "+item3+" Price: " +price3);
	    System.out.println("Total price: " + totalPrice);
	    scan.close();

	}

}
