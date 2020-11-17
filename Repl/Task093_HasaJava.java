package a_repl.A081_100;

import java.util.Scanner;

public class Task093_HasaJava {

	public static void main(String[] args) {
//		Given a string word, print true if "java" appears starting at index 0 or 1 
//		in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
//		The string may be any length, including 0word= . 
//				Example:
//				input: javapython
//				output: true
//
//				Example:
//				input: cjavac++
//				output: true
//
//
//				Example:
//				input: c#javaruby
//				output: false
		
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    if(word.length()<4) {
	    	exists = false;
	    }else {
	    	for(int i=0; i<=1;i++) {
				if(word.substring(i,i+4).equalsIgnoreCase("java")) {
					exists = true;
					break;
				}
			}
	    	
	    }
		
		System.out.println(exists);

	}

}
