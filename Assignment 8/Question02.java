package Assignment8;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
//		Create a method called cube. Write all required code inside this method in 
//		order to ask the user for a number and then prints the cubed value of that 
//		number:
//			Example:
//			input: 5
//			output: 125
		
		cube();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number: ");
		int x = scan.nextInt();
		cube(x);

	}
	private static void cube() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = scan.nextInt();
		int n3 = n*n*n;
		
		System.out.println("cube of " + n + " is: " + n3);
	}
	
	private static void cube(int x) {
		int n3 = x*x*x;
		System.out.println("cube of " + x + " is: " + n3);
	}

}
