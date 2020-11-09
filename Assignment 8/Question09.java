package Assignment8;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
//		Create a method called max. It gets two ints, x and max.
//		x is the test case, max is what we test against.
//		if x is bigger then max return max
//		in any other case return x.
//		for example:
//		max(1,10)
//		returns 1
//		max(11,5)
//		returns 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scan.nextInt();
		System.out.println("Enter max: ");
		int max = scan.nextInt();
		
		System.out.println(max(x, max));


	}

	private static int max(int x, int max) {
		if(x>max) {
			return max;
		}else {
			return x;
		}
		
	}

}
