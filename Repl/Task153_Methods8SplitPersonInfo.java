package a_repl.A141_160;

import java.util.Scanner;

public class Task153_Methods8SplitPersonInfo {
	
//	The method person get a string with this format : "name,last name,age"
//	for example: 
//	person("jon,doe,30");
//	the output is:
//	person name: jon last name: doe age: 30
//
//	hint: use the split method to split the string to a string array where there
//	is a "," char

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
		
//		person("jon,doe,30");
	}

	private static void person(String info) {
		
		
		String arr[] = info.split(",");
		
		System.out.print("person name: " + arr[0]);
		System.out.print(" last name: " + arr[1]);
		System.out.print(" age: " +  arr[2]);
		
	}

}
