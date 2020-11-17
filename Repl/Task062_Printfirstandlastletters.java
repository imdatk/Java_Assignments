package a_repl.A061_80;

import java.util.Scanner;

public class Task062_Printfirstandlastletters {

	public static void main(String[] args) {
//		Write a program that will print out first and last letters together.
		 //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(word.substring(0,1)+word.substring(word.length()-1));

	}

}
