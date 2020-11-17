package a_repl.A061_80;

import java.util.Scanner;

public class Task068_VerifyContains {

	public static void main(String[] args) {
//		Write a program that will verify if word contains in the sentence. 
//		Print out the result as boolean value. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Word: ");
	    String word = scan.nextLine();
	    System.out.println("Enter the text: ");
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    
	    if(sentence.contains(word)) {
	    	System.out.println(true);
	    }else {
	    	System.out.println(false);
	    }

	}

}
