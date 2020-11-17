package a_repl.A081_100;

import java.util.Scanner;

public class Task097_CountJava {

	public static void main(String[] args) {
//		Return the number of times that the string "java" appears anywhere in the 
//		given string word.
//
//		Example:
//		input: javaxjava
//		output: 2
//
//		Example:
//		input: javaxjavaapplepearjavaeggjavajava
//		output: 5
		
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    int counter=0;
		
		for(int i = 0; i<=word.length()-4;i++) {
			if(word.substring(i,i+4).equalsIgnoreCase("java")){
				counter++;
			}
		}
		System.out.println(counter);

	}

}
