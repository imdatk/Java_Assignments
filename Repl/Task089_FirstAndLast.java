package a_repl.A081_100;

import java.util.Scanner;

public class Task089_FirstAndLast {

	public static void main(String[] args) {
//		Write a program that will print out first and last letters together.
//
//		adobe
//		ae
		
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));

	}

}
