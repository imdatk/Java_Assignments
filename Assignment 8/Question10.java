package Assignment8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
//		isEven method gets a number(int) if its even (2,4,8...) returns true.
//		if its odd return false.
//		for example:
//		isEven(1) --> false
//		isEven(8) --> true
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scan.nextInt();
		System.out.println(isEven(x));
	}

	private static boolean isEven(int x) {
		
		boolean output = false;
		if(x%2 ==0) {
			output = true;
		}else {
			output = false;
		}
		return output;
		
	}

}
