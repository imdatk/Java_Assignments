package a_repl.A081_100;

import java.util.Scanner;

public class Task092_ShoppingList2 {

	public static void main(String[] args) {
		
//		In this assignment, you will write a program that will generate a shopping list.
//		It's more advanced version of assignment #22 (Shopping list I).
//		Your program should ask use to enter items followed by its price. 
//		After adding item,  ask user if he wants to add one more item. 
//		If so, repeat previous steps again. If no, print shopping list report and 
//		total price as show in examples. Your program should accept up to 10 items. 
//		Hint: use do while loop.	
		
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		do {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();	
			if(count>1) {
				shoppingListReport = shoppingListReport + ", " + "Item" + count+ ": " + item +
						" Price: " + price;
			}else {
				shoppingListReport = shoppingListReport + "Item" + count+ ": " + item +
						" Price: " + price;
			}
			totalPrice = totalPrice + price;
			count++;
			if(count==11) {
				break;
			}
			System.out.println("Add one more item?");
			countinue = scan.next();
		}while(countinue.equalsIgnoreCase("Yes"));
		
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice);
	}

}


