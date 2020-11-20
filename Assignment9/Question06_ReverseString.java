package Assignment9;

import java.util.Scanner;

public class Question06_ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = scan.next();
		scan.close();
		if(word.length()==5) {
			for (int i=word.length()-1; i>=0; i--) {
				System.out.print(word.charAt(i));
			}
			
		}else if(word.length()>5){
			System.out.println("Too long!");
		}else if(word.length()<5){
			System.out.println("Too short!");
		}
		
//		for (int i=word.length()-1; i>=0; i--) {
//		System.out.print(word.charAt(i));
//		}

	}

}
