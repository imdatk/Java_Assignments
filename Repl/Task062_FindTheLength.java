package a_repl.A061_80;

import java.util.Scanner;

public class Task062_FindTheLength {

	public static void main(String[] args) {
//		Write a program that will output length of the text (string).
//		Example:
//			Display message: "Please enter the text:"
//			input: java
//			Display message: "Length is: 4"
		System.out.println("Please enter the text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		System.out.println("Length is: " + text.length());
		

	}

}
