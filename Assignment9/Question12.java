package Assignment9;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
//		Given a string word, if the first or last chars are 'x' or 'X', 
//		print the string without those 'x' or 'X' chars, otherwise print the 
//		string unchanged.
//		Sample output:
//		     input: xHiX
//		     output: Hi
//		     input: apple
//		     output: apple
//		     input: xUxL
//		     output: UxL
//		     input: JavaX
//		     output: Java
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = scan.nextLine();
		scan.close();
		
		if(word.substring(0,1).equalsIgnoreCase("x") || word.substring(word.length()-1).
				equalsIgnoreCase("x")) {
			System.out.println(word.replace("x","").replace("X", ""));
		}else {System.out.println(word);}
			
		

	}

}
