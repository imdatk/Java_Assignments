package a_repl.A081_100;

import java.util.Scanner;

public class Task087_ZombieAttack1 {
//	A variable inhabitants represents a city and its respective populations. 
//	City might have a population of 0 due to a pandemic zombie disease that is wiping
//	away the human lives. After each day, a city will lose half of its population.
//	write a program to loop the city population and make it lose half of its 
//	population until no humans left. Print the each day like below for each day:
//
//		example1- inhabitants is 6
//
//		Day 0 [6]
//		Day 1 [3]
//		Day 2 [1]
//		---- EXTINCT ----
//
//		example2- inhabitants is 0
//		---- EXTINCT ----
//
//		example3- inhabitants is 20
//		Day 0 [20]
//		Day 1 [10]
//		Day 2 [5]
//		Day 3 [2]
//		Day 4 [1]
//		---- EXTINCT ----

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number of Inhabitants: ");
		    int inhabitants = scan.nextInt();
		    int day = 0;
		    if(inhabitants == 0) {
		    	System.out.println("---- EXTINCT ----");
		    }else {
		    	System.out.println("Day " + day + " ["+inhabitants+"]");
		    }
		    while(inhabitants>0) {
		    	inhabitants = inhabitants/2;
		    	day++;
		    	if(inhabitants > 0) {
		    		System.out.println("Day " + day + " ["+inhabitants+"]");
		    	}else if(inhabitants == 0) {
		    		System.out.println("---- EXTINCT ----");
		    	}
		    	
		    }
	}

}
