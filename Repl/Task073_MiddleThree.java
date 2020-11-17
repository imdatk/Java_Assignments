package a_repl.A061_80;

import java.util.Scanner;

public class Task073_MiddleThree {

	public static void main(String[] args) {
//		You have a word, do the following:
//		If the word has odd number of characters and has 5 or more characters, 
//		print the middle three characters of the word. Otherwise, print "invalid".
//		Sample Output:
//			       fifteen ==> fte
//			       apple ==> ppl
//			       hey ==> invalid
//			       java ==> invalid
//			       whatsup ==> ats
//			       $ ==> invalid
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your word: ");
		 String word = scan.next();
		    //YOUR CODE HERE
		 int count = word.length();
		 int halfWord = (word.length()-1)/2;
		 
//		if(word.length()%2 != 0 && word.length()>=5) {
//			System.out.println(word.substring((word.length()-1)/2-1,(word.length()-1)/2+2));
//		}else {
//				System.out.println("invalid");
//		}
		 
		if(count%2 != 0 && count>=5) {
			System.out.println(word.substring(halfWord-1,halfWord+2));
		}else {
				System.out.println("invalid");
		}
		 
		 
		 

	}

}
