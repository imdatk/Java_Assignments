package a_repl.A101_120;

import java.util.Scanner;

public class Task106_PrintVowels {

	public static void main(String[] args) {
//		Inputs:
//			String word;
//
//			Write a for loop that will loop through every letter of the input and print 
//			out just the vowels. Sample input/outputs
//			In: howdyho
//			oo
//
//			In: huehuehuehue
//			ueueueue
//
//			In: poopoo what idk what im doing
//			ooooaiaioi
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    for(int i=0; i<=word.length()-1; i++) {
	    	if(word.charAt(i) == 'a' || word.charAt(i) == 'A' ||word.charAt(i) == 'e' ||
	    	   word.charAt(i) == 'E' ||word.charAt(i) == 'o' ||word.charAt(i) == 'O' ||
	    	   word.charAt(i) == 'u' ||word.charAt(i) == 'U' ||word.charAt(i) == 'i' ||
	    	   word.charAt(i) == 'I') {
	    		System.out.print(word.charAt(i));
	    	}
	    }
	    

	}

}
