package assignments.repl;

import java.util.Scanner;

public class Task041_PositiveNegativeZero {
	
//	U have an Integer number already declared and assigned value.
//	Using Multi-Branch if statements, check if number is positive, negative or zero. 
//	Please follow the below examples and print message accordingly:
//
//	Enter a number:
//	10
//	10 is positive
//
//	Enter a number:
//	-55
//	-55 is negative
//
//	Enter a number:
//	0
//	it is zero

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	    
	   //CODE HERE 
	    if (number > 0) {System.out.println(number + " is positive");}
	    else if (number < 0) {System.out.println(number + " is negative");}
	    else {System.out.println("it is zero");}

	}

}
