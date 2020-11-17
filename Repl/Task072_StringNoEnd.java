package a_repl.A061_80;

import java.util.Scanner;

public class Task072_StringNoEnd {

	public static void main(String[] args) {
//		in this exercise you get a string called txt .
//
//		output txt without its last letter.
//
//		for example:
//
//		txt = "foo"
//
//		output will be:
//		fo
//
//		hint
//		use substring() and length() togather to solve this.
//		substring will start at 0 and will end at txt length -1
		 	
			Scanner s = new Scanner(System.in);
			System.out.println("Enter text:");
		    String txt = s.next();
		    //your code here
		    System.out.println(txt.substring(0,txt.length()-1));

	}

}
