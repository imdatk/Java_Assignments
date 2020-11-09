package Assignment8;

import java.util.Scanner;

public class Question07_palindrome {

	public static void main(String[] args) {
//		Complete a method isPalindrome() that will check if the number is a palindrome.
//		Print your result as a boolean (true or false).
//		Do not convert int into a string!
//		Example:
//		input: 1001
//		output: true
//		Example:
//		input: 1234
//		output: false

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long x = scan.nextInt();
		scan.close();
		System.out.println(isPalindrome(x));
//		System.out.println(isPalindromeWithString(x));
	
	}

	private static boolean isPalindrome(long x) {
		long y = x;	
		long reverse=0;
		while(x>0) {
			long r = x%10; // the last digit
			reverse = (reverse*10)+r; 
			x = x/10;
		}
		
		if(reverse == y ) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
//	private static boolean isPalindromeWithString(long x) {
//		String r = "";
//		String p = Long.toString(x);
//		for(int i=p.length()-1; i>=0; i-- ) {
//			char reverse = p.charAt(i);
//			r = r + reverse;
//		}
//		
//		if(r.equals(p) ) {
//			return true;
//		}else {
//			return false;
//		}
//		
//		
//	}
	
	

}
