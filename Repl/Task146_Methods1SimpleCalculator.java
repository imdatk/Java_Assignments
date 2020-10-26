package assignments.repl;

import java.util.Scanner;

public class Task146_Methods1SimpleCalculator {

	public static void main(String[] args) {
//		create a static method called "plus", its return is void and it gets no arguments.
//		It asks the user to input two numbers, then it will add them and print the result.
//		Create a scanner within plus method.
//
//		Example:
//		enter first number:
//		1
//		enter second number:
//		2
//		result: 3
		
		plus();
		
		

	}
	
	public static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = scan.nextInt();
		System.out.println("enter second number:");
		int num2 = scan.nextInt();
		System.out.println("result: " + (num1 + num2));
	}

}
