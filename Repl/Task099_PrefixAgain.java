package a_repl.A081_100;

import java.util.Scanner;

public class Task099_PrefixAgain {

	public static void main(String[] args) {
//		Given a string, consider the prefix string made of the first n chars of the 
//		string. Does that prefix string appear somewhere else in the string? 
//		Assume that the string is not empty and that n is in the range from 1 till 
//		str.length().
//
//				Example:
//				input: abXYabc
//				input: 1
//				output: true
//				a appears twice
//
//				Example:
//				input: abXYabc
//				input: 2
//				output: true
//				ab appears twice
//
//				Example:
//				input: abXYabc
//				input: 3
//				output: false
//				abX appears once only
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text: ");
		String str = scan.nextLine();
		int n = scan.nextInt();
		int counter = 0;
		if(n<=str.length()) {
			String prefix = str.substring(0,n);
			
			for (int i=1; i<=str.length()-n; i++) {
				if(str.substring(i, i+n).equals(prefix)) {
					counter++;
				}
			}
			
		}else {
			System.out.println("invalid entry!");
		}
		if(counter>=1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
