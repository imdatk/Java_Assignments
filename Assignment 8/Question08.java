package Assignment8;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
//		Complete a method fib() that will compute Fibonacci numbers
//		In fibonacci series, next number is the sum of previous two numbers 
//		for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci series are 0 and 1.
//		Given a number num, print n-th Fibonacci Number.
//		Input : 2
//		Output : 1
//		Input : 9
//		Output : 21
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int x = scan.nextInt();
		scan.close();
		
		System.out.println(fibonacci(x));
		
		
		
//		int x = 15;
//		int previous = 0;
//		int current = 1;
//		int next=0;
//		System.out.print(previous + "," + current + ",");
//		for(int i = 0; i<x-2; i++) {
//			next = previous + current;
//			previous = current;
//			current = next;
//			System.out.print(next);
//			if(i==x-3) {
//				break;
//			}
//			System.out.print(",");
//		}
		

	}

	private static int fibonacci(int x) {
		int previous = 0;
		int current = 1;
		int next=0;
		for(int i = 2; i<x; i++) {
			next = previous + current;
			previous = current;
			current = next;
		}
		return next;
		
	}

}
