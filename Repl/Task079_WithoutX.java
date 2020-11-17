package a_repl.A061_80;

import java.util.Scanner;

public class Task079_WithoutX {

	public static void main(String[] args) {
//		Given a string word, if the first or last chars are 'x' or 'X', print 
//		the string without those 'x' or 'X' chars,  otherwise print the string 
//		unchanged. 
//
//		Example: 
//		input: xHiX 
//		output: Hi
//
//		Example:
//		input: apple 
//		output: apple
//
//		input: xUxL
//		output: UxL
//
//		input: JavaX
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
//	    if(word.substring(0,1).equalsIgnoreCase("x")|| word.substring(word.length()-1).equalsIgnoreCase("x")) {
//	    	System.out.println(word.replace("x","").replace("X", ""));
//	    }else {
//	    	System.out.println(word);
//	    }
	    
	    if(word.substring(0,1).toUpperCase().equals("X")) {
	    	System.out.println(word.replace("x","").replace("X", ""));
	    }else {
	    	System.out.println(word);
	    }

	}

}
