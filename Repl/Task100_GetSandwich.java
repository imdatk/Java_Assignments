package a_repl.A081_100;

import java.util.Scanner;

public class Task100_GetSandwich {

	public static void main(String[] args) {
//		A sandwich is two pieces of bread with something in between. 
//		Print the string that is between the first and last appearance of 
//		"bread" in the given string, or return string "nothing" if there are 
//		not two pieces of bread.
//
//				Example:
//				input: breadjambread
//				output: jam
//
//				Example:
//				input: xxbreadjambreadyy
//				output: jam
//
//				Example:
//				input: xxbreadapple
//				output: nothing
//
//				Example:
//				input: breadbutterbread
//				output: butter
		
//		xxbreadbreadjambreadyy
		
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int counter = 0;
	     for(int i=0; i<=str.length()-5;i++) {
	    	 if(str.substring(i, i+5).equals("bread")) {
	    		 counter++;
	    	 }
	     }
    	 if(counter>1) {
    		 System.out.println(str.substring(str.indexOf("bread")+5,(str.indexOf("bread", str.indexOf("bread")+6))));
    	 }else {
    		 System.out.println("nothing");
    	 }
	}

}
