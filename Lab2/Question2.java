package assignments.Lab2;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
//		A bag of cookies holds 40 cookies. The calorie information on the bag claims
//		that there are 10 serving in the bag and that a serving equals 300 calories. 
//		write a program that lets the user enter the number of cookies he or she 
//		actually ate and then reports the number of total calories consumed.
		
		int boC = 40;
		int serving = 10;
		int cookiesPerServing = boC/serving;
		int caloriesperCookiee = 300 / cookiesPerServing;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of cookies eaten: ");
		int noEC = scan.nextInt();
		
		int totalCaloriesConsumed = noEC * caloriesperCookiee;
		
		System.out.println(totalCaloriesConsumed);
		
		
		
		
	}

}
