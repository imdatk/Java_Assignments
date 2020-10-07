package Assignment5;

import java.util.Scanner;

public class Question06_Fobinacci {

	public static void main(String[] args) {
//		Write a program to print Fibonacci series of n terms 
//		where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		int current = 1;
		int previous = 0;
		System.out.print(previous + ", " + current + ", ");
		
		for (int i = 2; i < num; i++) {
			int next = current + previous;
			System.out.print(next + ", ");
			previous = current;
			current = next;
		}
		
		System.out.println("........");
		
		

	}

}
