package a_repl.A081_100;

import java.util.Scanner;

public class Task099_CountTripples {

	public static void main(String[] args) {
//		We'll say that a "triple" in a string is a char appearing three times in a row.
//		Print out the number of triples in the given string. The triples may overlap.
//		Example:
//		input: abcXXXabcddd
//		output: 2
//
//		Example:
//		input: xxxabyyyycd
//		output: 3
//
//		Example:
//		input: java
//		output: 0
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int count = 0 ;
	    //WRITE YOUR CODE HERE
	    if(str.length()>=3) {
	    	for(int i=0; i<=str.length()-3;i++) {
		    	if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
		    		count++;
		    	}
		    }
	    	
	    }
	    
	    System.out.println(count);
		
		

	}

}
