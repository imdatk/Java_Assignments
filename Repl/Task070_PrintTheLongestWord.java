package a_repl.A061_80;

import java.util.Scanner;

public class Task070_PrintTheLongestWord {

	public static void main(String[] args) {
//		Write a program that will print out the longest word.
		 //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the first Word: ");
	    String word1 = scan.next();
	    System.out.println("Enter the second Word: ");
	    String word2 = scan.next();
	    //WIRTE YOUR CODE HERE
	    
	    if(word1.length()>word2.length()) {
	    	System.out.println(word1);
	    }else {
	    	System.out.println(word2);
	    }

	}

}
