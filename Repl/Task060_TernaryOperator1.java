package assignments.repl;

import java.util.Scanner;

public class Task060_TernaryOperator1 {

	public static void main(String[] args) {
//		Write an expression using the conditional operator (? :) 
//		that compares the value of the variable x to 5 and results in:
//			Display x if x is greater than or equal to 5
//			Display -x if x is less than 5
		
		 //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
		int x = scan.nextInt();
		//WRITE YOUT CODE HERE
		
//		String result = (x>=5) ? "x" : "-x";
//		System.out.println(result);
		
		int result = (x>=5) ? x : -x;
		System.out.println(result);
		

	}

}
