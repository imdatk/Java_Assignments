package a_repl.A121_140;

import java.util.Arrays;
import java.util.Scanner;

public class Task140_ArraysPrintFirstLast {
//	Given a String array words, iterate through each word and print first and last letter of each element in the format below.
//
//	Example:
//
//	words → ["hello", "why", "by", "apple" , "note"]
//	print → [ho, wy, by, ae, ne] 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
//	    Write your code below
	    String[] newArr = new String[words.length];
	    for(int i=0; i<words.length; i++) {
	    	newArr[i]=""+words[i].charAt(0) + words[i].charAt(words[i].length()-1); 
	    }
	    System.out.println(Arrays.toString(newArr));

	}

}
