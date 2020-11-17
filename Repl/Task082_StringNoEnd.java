package a_repl.A081_100;

import java.util.Scanner;

public class Task082_StringNoEnd {

	public static void main(String[] args) {
//		In this exercise you get a string called txt .
//
//		output txt without its last letter.
//
//		for example:
//
//		txt = "foo"
//
//		output will be:
//		fo
		
		  Scanner s = new Scanner(System.in);
		  String txt = s.next();
		  //your code here
		  System.out.println(txt.substring(0,txt.length()-1));

	}

}
