package Assignment5;

import java.util.Scanner;

public class Question09_Odd {

	public static void main(String[] args) {
//		Write a program for the following logic:
//		Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
//		if end = 10, OUTPUT = 1, 3, 5, 7, 9
//		if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//
//		You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the highest number in the row: ");
	int end = scan.nextInt();
	int i=0;
	if (end%2 == 0) {
		while(i <=(end-2)) {
			if (i%2 != 0) {
				System.out.print(i + ",");
			}
			i++;}
		if (i%2 != 0) {System.out.print(i);
		}
	}else {
		
		while(i <=(end-1)) {
			if (i%2 != 0) {
				System.out.print(i + ",");
			}
			i++;}
		if (i%2 != 0) {System.out.print(i);
		
	}
	
	}
	}
}
