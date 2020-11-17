package a_repl.A081_100;

import java.util.Scanner;

public class Task083_StringSubstring {

	public static void main(String[] args) {
//		using substring method output the first two letters of txt string
//		for examole:
//		String txt = "foo"
//		the first two letters are "fo"
//
//
//		use print not println.
		
		Scanner s = new Scanner(System.in);
	    String txt = s.next();
	    //your code here
	    System.out.println(txt.substring(0,2));

	}

}
