package a_repl.A081_100;

import java.util.Scanner;

public class Task096_PrintLetters {

	public static void main(String[] args) {
//		Write a program that will print out letters in the alphabetic order accordingly 
//		to the given range. 
//		Example:
//		input: A
//		input: Z
//		output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//
//		Example:
//		input: a
//		input: f
//		output: abcdef
//
//		Example:
//		input: a
//		input: d
//		output: abcd
//
//		Example:
//		input: B
//		input: O
//		output: BCDEFGHIJKLMNO
		
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);  // ********
	    char end = scan.next().charAt(0);
	    
	    for(char i = start; i<=end;i++) {
	    	System.out.print(i);
	    }

	}

}
