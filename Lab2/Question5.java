package assignments.Lab2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
//		Write a program that computes the tax and tip on a restaurant bill. 
//		The program should ask the user to enter the charge for the meal. 
//		The tax should be 6.75 percent of the meal charge. 
//		The tip should be 20 percent of the total after adding tax. 
//		Display the meal charge, tax amount, tip amount, and total bill on the screen.

		double tax, tip;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the charge: ");
		double charge = scan.nextDouble();
		tax = charge * 0.0675;
		tip = (charge + tax)*0.2;
		double total = charge + tax + tip; 
		
		System.out.println("---------------------\n---------------------");
		System.out.println();
		System.out.println("      Your Bill     ");
		System.out.println("      ---------");
		System.out.println();
		System.out.println("  Charge : " + charge);
		System.out.println("  Tax    : " + tax);
		System.out.println("  Tip    : " + tip);
		System.out.println("  Total  : " + total);
		System.out.println();
		System.out.println("---------------------\n---------------------");
		
	}

}
