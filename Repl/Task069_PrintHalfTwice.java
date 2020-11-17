package a_repl.A061_80;

import java.util.Scanner;

public class Task069_PrintHalfTwice {

	public static void main(String[] args) {
//		Write a program that will print out first half of the word twice. 
//
//		Example:
//
//		input: java
//		output: jaja
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    System.out.println(word.substring(0, word.length()/2)+word.substring(0, word.length()/2));
	    
	    String halfWord = word.substring(0, word.length()/2);
	    System.out.println(halfWord + halfWord);

	}

}
