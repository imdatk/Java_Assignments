package a_repl.A061_80;

import java.util.Scanner;

public class Task064_PrintLastCharacter {

	public static void main(String[] args) {
//		Write a program that will print out first character of the word. 
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(word.substring(word.length()-1));
	    System.out.println(word.charAt(word.length()-1));
	    
	    int charCount = word.length();
	    int lastCharIndex = charCount -1;
	    char lastChar = word.charAt(lastCharIndex);
	    System.out.println(lastChar);

	}

}