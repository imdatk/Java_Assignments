package a_repl.A061_80;

import java.util.*;

public class Task061_TernaryOperator2 {

	public static void main(String[] args) {
//		Write an expression using the conditional operator (? :) that compares 
//		the values of the variables num1 and num2. The result (that is the value) 
//		of this expression should be the value of the larger of the two variables.  
//		The larger value should be printed out.
		
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			scan.close();
			//WRITE YOUR CODE HERE
			int result;
			result = (num1>num2)? num1 : num2;
			System.out.println("Larger numer is: " + result);

	}

}
