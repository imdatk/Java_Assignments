package a_repl.A121_140;

import java.util.Scanner;

//Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//Example:
//sentence -> "Java is fun"
//Print
//fun
//is
//Java	

	public class Task137_ArraysReverseSentence {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    String[] sentenceArr = sentence.split(" ");
    for(int i=sentenceArr.length-1; i>=0;i--) {
    	System.out.println(sentenceArr[i]);
    }

	}

}
