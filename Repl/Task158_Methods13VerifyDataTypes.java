package a_repl.A141_160;

import java.util.Scanner;

public class Task158_Methods13VerifyDataTypes {

	public static void main(String[] args) {
//		Given a method printDataTypes with one string parameter, that must determine which primitive
//		data types are capable of properly storing that input. Please complete an implementation of this method.
//		
//		For each input variable  and appropriate primitive , you must determine if the given 
//		primitives are capable of storing it. If yes, then print:
//			n can be fitted in:
//			* dataType
//
//		If there is more than one appropriate data type, print each one on its own line and order 
//		them by size (i.e.: ).
//			byte < short < int < long
//
//		if the number cannot be stored in one of the four aforementioned primitives, print the line:
//		n can't be fitted anywhere.
//
//			Example:
//			input: -100
//			output:
//			-100 can be fitted in:
//			* byte
//			* short
//			* int 
//			* long
//
//			Example:
//			input: 32000
//			output:
//			32000 can be fitted in:
//			* short 
//			* int 
//			* long
//
//			Example:
//			input:  2147483000
//			output:
//			2147483000 can be fitted in: 
//			* int 
//			* long
//
//			Example:
//			input: 213333333333333333333333333333333333
//			output: 213333333333333333333333333333333333 can't be fitted anywhere.
//
//			Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and 
//			double. For this exercise, we'll work with the primitives used to hold integer values 
//			(byte, short, int, and long):
//
//			To get you started, a portion of the solution is provided for you in the editor.
//			Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		
		Scanner scan = new Scanner(System.in);
	    String numStr = scan.next();
	    printDataTypes(numStr);
	  	}
	  
	  public static void printDataTypes(String numStr){
	    long num = 0;
	    try{
	       num = Long.valueOf(numStr);
	       System.out.println(num+" can be fitted in:");
	       if(num>=-128 && num<=127){
	            System.out.println("* byte");
	        }
	        //WRITE YOUR CODE HERE
	       if(num>=-32768 && num<=32767){
	            System.out.println("* short");
	        }
	       if(num>=-2147483648 && num<=2147483647){
	            System.out.println("* int");
	        }
	       if(num>=-9223372036854775808L && num<=9223372036854775807L){
	            System.out.println("* long");
	        }
	        
	     //DO NOT CHANGE        
	    }catch(Exception e){
	       System.out.println(numStr+" can't be fitted anywhere.");
	    }
	  }

}
