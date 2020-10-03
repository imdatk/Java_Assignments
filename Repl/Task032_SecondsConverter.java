package assignments.repl;

import java.util.*;

public class Task032_SecondsConverter {

	public static void main(String[] args) {
//		Write a program that outputs the number of hours, minutes, and seconds that
//		corresponds to input total seconds. 
//
//		-create a Scanner object
//		- declare int variables inputSeconds, hours, minutes, seconds
//		-Ask user enter seconds by printing:
//		"Enter seconds:"
//
//		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
//		-Assign values to the hours, minutes, seconds variables
//		-Display the result.
//
//		Example run:
//		Enter seconds:
//		3695
//		1 hours, 1 minutes, and 35 seconds
		
	Scanner scan = new Scanner(System.in);
		
	int inputSeconds, hours, minutes, seconds;
	
	System.out.println("Enter Seconds");
	inputSeconds = scan.nextInt();
	
	hours = inputSeconds/3600;
	minutes = (inputSeconds-hours*3600)/60;
	seconds = inputSeconds%60;	
	System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
	}

}
