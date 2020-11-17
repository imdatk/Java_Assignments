package a_repl.A161_180;

import java.util.Scanner;

public class Task161_Methods16Palindrome {

	public static void main(String[] args) {
//		Complete a method isPalindrome() that will check if number is a palindrome. 
//		Print your result as a boolean (true or false). 
//		Do not convert int into a string!
//		Example:
//		input: 1001
//		output: true
//
//		Example:
//		input: 1234
//		output: false
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);

	}

	private static void isPalindrome(int num) {
		int newNum =0;
		int num1 = num;
		while(num1>0) {
			int digit = num1%10;
			newNum = newNum*10 + digit;
			num1 = num1/10;
			
		}
		if(newNum == num) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
	}

}
