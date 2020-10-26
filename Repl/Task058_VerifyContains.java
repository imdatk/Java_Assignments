package assignments.repl;

import java.util.Scanner;

public class Task058_VerifyContains {

	public static void main(String[] args) {
//		Write a program that will verify if word contains in the sentence.
//		Print out the result as boolean value.
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    scan.close();
	    boolean contains = true;
	    if (sentence.contains(word)) {
	    	System.out.println(contains);
	    }else {
	    	System.out.println(!contains);
	    }

	}

}
