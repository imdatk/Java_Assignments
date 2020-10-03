package assignments.repl;

import java.util.Scanner;

public class Task042_OddEven {

	public static void main(String[] args) {
		
//		U have an Integer number already declared and assigned value.
//		Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	   
	    //CODE HERE 
	    if (number%2 == 0) {System.out.println(number + " is even");}
	    else {System.out.println(number + " is odd");}


	}
}