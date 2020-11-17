package a_repl.A141_160;

import java.util.Scanner;

public class Task148_Methods3FindCube {

	public static void main(String[] args) {
//		Given method called cube. Write all required code inside this method
//		in order  to asks the user for a number and then prints the cubed value 
//		of that number:
//
//			Example:
//			input: 5
//			output: 125
//
//			hint: cube of a number n = n*n*n
		
		cube();

	}

	private static void cube() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int cube = n*n*n;
		System.out.println(cube);
		
	}

}
