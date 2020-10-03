package assignments.repl;

import java.util.Scanner;

public class Task033_CaffeineOverDose {

	public static void main(String[] args) {
//		Scientists estimate that roughly 10 grams of caffeine consumed at one time is a  lethal overdose.  
//		Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs 
//		how many drinks it takes to kill a person. In one gram, there is 1000 mg. Please refer to the image 
//		above as an example and use any number of variables you want. Dots mean space in the picture. 
//
//		Formula to get drink count to cause an overdose is  
//		10*1000 / numOfMilligrams
		
		Scanner scan = new Scanner(System.in);
		
		final int limitToKill = 10000;
		
		int miligramInDrink = scan.nextInt();
		
		int numberOfDrinksToKill = limitToKill / miligramInDrink;
		if (numberOfDrinksToKill*miligramInDrink < 10000) {
			numberOfDrinksToKill = numberOfDrinksToKill + 1;
			System.out.println("Number of Drinks to Kill: " + numberOfDrinksToKill);
		}else {System.out.println("Number of Drinks to Kill: " + numberOfDrinksToKill);}
		

	}

}
