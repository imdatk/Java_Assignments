package Assignment8;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
//		Create a method called sign. It gets a number and tells you if its positive,
//		negative or zero.
//		for example :
//		sign(5) => 1
//		sign(-30)=> -1
//		sign(0) => 0
//		sign gets an int parameter.
//		print out 1,-1 or 0 depending on the input
//		the parameter should be entered by user (create a scanner object)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int x = scan.nextInt();
		sign(x);
	}

	private static void sign(int x) {
		if(x>0) {
			System.out.println(1);
		}else if(x<0) {
			System.out.println(-1);
		}if(x==0) {
			System.out.println(0);
		}
		
	}

}
