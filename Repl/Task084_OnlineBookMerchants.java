package a_repl.A081_100;

import java.util.Scanner;

public class Task084_OnlineBookMerchants {

	public static void main(String[] args) {
//		 Online Book Merchants offers premium customers 1 free book with every 
//		 purchase of 5 or more books and offers 2 free books with every purchase 
//		 of 8 or more books. It offers regular customers 1 free book with every 
//		 purchase of 7 or more books, and offers 2 free books with every purchase
//		 of 12 or more books. 
//	     Write a program that assigns freeBooks the appropriate value based on 
//	     the values of the boolean variable isPremiumCustomer and the int 
//	     variable nbooksPurchased. Print amount of freeBooks into the console. 
	     
	     int freeBooks = 0;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Is Premium Customer?");
		 boolean isPremiumCustomer = scan.nextBoolean();
		 System.out.println("Enter the number of books purchased:");
		 int nbooksPurchased = scan.nextInt();
		 
//		 if(isPremiumCustomer) {
//			 if(nbooksPurchased>=5 && nbooksPurchased<8) {
//				 freeBooks = 1;
//			 }else if(nbooksPurchased>=8) {
//				 freeBooks = 2;
//			 }
//			 
//		 }else {
//			 if(nbooksPurchased>=7 && nbooksPurchased<12) {
//				 freeBooks = 1;
//			 }else if(nbooksPurchased>=12) {
//				 freeBooks = 2;
//			 }
		 
		 if(isPremiumCustomer) {
			 if(nbooksPurchased>=8) {
				 freeBooks = 2;
			 }else if(nbooksPurchased>=5) {
				 freeBooks = 1;
			 }
			 
		 }else {
			 if(nbooksPurchased>=12) {
				 freeBooks = 2;
			 }else if(nbooksPurchased>=7) {
				 freeBooks = 1;
			 }
		 }
		 System.out.println("Number of free books: "+ freeBooks);
	}

}
