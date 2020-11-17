package a_repl.A101_120;

import java.util.Scanner;

public class Task120_ArraysFindingLength {

	public static void main(String[] args) {
//		Given the array words, it will print the word with the largest length. 
//		Assume that there are no 2 words with longest length
//
//		Example:
//		words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//		prints jaaaaavvaaaaaaaaaa
		
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		String max=words[0];
	    for(int i=0; i<words.length; i++) {
	    	if(words[i].length()>max.length()) {
	    		max= words[i];
	    	}
	    }
	    System.out.println(max);

	}

}
