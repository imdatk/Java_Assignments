package a_repl.A121_140;

import java.util.Scanner;

public class Task135_ArraysSplit {

	public static void main(String[] args) { 
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //type your code below
    
//    Given a String variable sentence, write code to type each word in separate lines.
//
//    Example:
//    sentence -> "Java is fun"
//    Print
//    Java
//    is
//    fun
	   
       String[] sentenceArr = sentence.split(" ");
	   for(int i=0; i<sentenceArr.length; i++) {
		   System.out.println(sentenceArr[i]);
	   }

	}

}
