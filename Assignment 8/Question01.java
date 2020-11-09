package Assignment8;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
//		Create a method called "plus", its return is void and it gets no arguments.
//		It asks the user to input two numbers, then it will add them and print the 
//		result.
//		Create a scanner within the plus method.
//		Example:
//		enter first number:
//		1
//		enter second number:
//		2
//		result: 3
		
		plus();

	}

	private static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number: ");
		int n1 = scan.nextInt();
		System.out.println("enter second number: ");
		int n2 = scan.nextInt();
		int n3 = n1+n2;
		System.out.println("result: " + n3);
	}

}
