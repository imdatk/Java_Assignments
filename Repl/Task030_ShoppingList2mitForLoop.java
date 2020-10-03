package assignments.repl;

import java.util.Scanner;

public class Task030_ShoppingList2mitForLoop {

	public static void main(String[] args) {
		String item;
		double price=0, totalPrice=0;
		int count = 0;
		int j=1;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=1; i<=3; i++) {
			System.out.println("Enter Item" + j +", count and its price:");
			totalPrice = totalPrice + price * count;
			if (totalPrice > 0) {
				System.out.println("Ara Toplam: " + totalPrice);
			}
			item =scan.next();
			count = scan.nextInt();
			price = scan.nextDouble();
			System.out.println("Item" + j++ + " is \"" + item + "\", count is "+count+ ", price is "+ price);
		}
			System.out.println("Total Price: " + (totalPrice + price * count));
		
		
//		System.out.println("Enter Item1, count and its price:");
//		item1 =scan.next();
//		count1= scan.nextInt();
//		price1 = scan.nextDouble();
//		// System.out.println("Item1 is \"" + item1 + "\", count is "+count1+ ", price is "+ price1);
//		
//		System.out.println("Enter Item2, count and its price:");
//		item2 =scan.next();
//		count2= scan.nextInt();
//		price2 = scan.nextDouble();
//		// System.out.println("Item2 is \"" + item2 + "\", count is "+count2+ ", price is "+ price2);
//		
//		System.out.println("Enter Item3, count and its price:");
//		item3 =scan.next();
//		count3= scan.nextInt();
//		price3 = scan.nextDouble();
//		// System.out.println("Item3 is \"" + item3 + "\", count is "+count3+ ", price is "+ price3);
		
//		if (count2 <1) {
//			totalPrice = price1+price3;
//			report = "Item 1: " + item1+ " Price: "+ price1 + ", Item 3: " + item3+ " Price: " + price3;
//			System.out.println(report);
//			System.out.println("Total price: " + totalPrice);
//		}
//		else if (count3 <1) {
//			totalPrice = price1+price2;
//			report = "Item 1: " + item1+ " Price: "+ price1 + ", Item 2: " + item2+ " Price: " + price2;
//			System.out.println(report);
//			System.out.println("Total price: " + totalPrice);
//		}		
//		else {
//			totalPrice = price1+price2+price3;
//			report = "Item 1: " + item1+ " Price: "+ price1 + ", Item 2: " + item2+ " Price: "+ price2 + ", Item 3: " + item3+ " Price: " + price3;
//			System.out.println(report);
//			System.out.println("Total price: " + totalPrice);}
//		scan.close();

	}

}
