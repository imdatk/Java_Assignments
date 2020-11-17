package a_repl.A121_140;

import java.util.Scanner;

public class Task138_ArraysReverseSentence2 {

	public static void main(String[] args) {
//		Given a String variable sentence, write code to get each word and assign to String reversed in reverse order. 
//
//		Example:
//		sentence -> "Java is fun"
//		reversed -> "fun is Java"
//		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    String[] sentenceArr = sentence.split(" ");
	    for(int i=sentenceArr.length-1; i>=0; i--) {
	    	reversed = reversed + sentenceArr[i]+" ";
	    }
	    reversed=reversed.trim();
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed);

	}

}
