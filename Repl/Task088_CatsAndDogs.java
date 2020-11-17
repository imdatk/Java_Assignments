package a_repl.A081_100;

import java.util.Scanner;

public class Task088_CatsAndDogs {

	public static void main(String[] args) {
//		Print true if the string "cat" and "dog" appear the same number of times in the
//		given string word. 
//		Example:
//		input: catdog
//		output: true
//
//		Example:
//		input: catcat
//		output: false
//
//		Example:
//		input: cat-cheetah-dog-cat-dog-dog-Cat
//		output: false
		
		 Scanner scan = new Scanner(System.in);
		 int countOfCats = 0;
		 int countOfDogs = 0;
		 String word = scan.next();
		 
		 for(int i=0; i<=word.length()-3; i++) {
			 if(word.substring(i,i+3).equalsIgnoreCase("dog")) {
				 countOfDogs++;
			 }
			 if(word.substring(i,i+3).equalsIgnoreCase("cat")) {
				 countOfCats++;
			 }
		 }
		 if(countOfCats == countOfDogs) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
		 }
	}

}
