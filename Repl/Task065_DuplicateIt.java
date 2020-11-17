package a_repl.A061_80;

import java.util.Scanner;

public class Task065_DuplicateIt {

	public static void main(String[] args) {
//		You have 2 words
//		Print the first word, second word, second word, first word
//
//		Input:
//		one
//		two
//		Output: 
//		onetwotwoone
		
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    System.out.println(word1.concat(word2).concat(word2).concat(word1));

	}

}