package assignments.Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
//		Write a program that asks the user for a positive nonzero integer value.
//		The program should use a loop to get the sum of all the integers 
//		from 1 up to the number entered. 
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a positive integer value:");
		int value = scan.nextInt();
		if(value > 0) {
			for (int i=1; i<=value; i++) {
				sum = sum+i;
			}
			System.out.println("Sum is equal to: " + sum);
			
		}else {
			System.out.println("Invalid entry!");
		}
		
		
	}

}
