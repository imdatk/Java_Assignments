package a_repl.A141_160;

import java.util.Scanner;

public class Task160_MethodsArraysUnique {
	
//	Complete a void method printUniqueWords() that will print only unique words from an 
//	array of strings. Every single unique word should be printed from the new line. 
//
//	Example:
//	input:[java, code, python, code, rust, code, rust]
//	output:
//	java
//	python

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size:");
	    int size = scan.nextInt();
	    String[] words = new String[size];
	    System.out.println("Enter words:");
	    for(int i=0; i < size; i++){
	      words[i] = scan.next();
	    }
	    printUniqueWords(words);

	}

	private static void printUniqueWords(String[] words) {
		int counter =0;
		for(int i = 0; i<words.length;i++) {
			for(int j=0;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					counter++;
				}
			}
			if(counter==1) {
				System.out.println(words[i]);
			}
			counter = 0;
		}
	}
}

