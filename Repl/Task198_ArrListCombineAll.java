package a_repl.A181_200;

import java.util.ArrayList;
import java.util.Arrays;

//	Create a static method that:
//	is called combineAL
//	returns an ArrayList
//	takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList
//	of Strings called wordList2
//	
//	This method should create a new ArrayList of Strings, add all the words (in order)
//	from wordList1, then add all the words (in order) from wordList2.  In other words,
//	it is combining all the elements from the two parameters.

public class Task198_ArrListCombineAll {

	public static void main(String[] args) {
		ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("Ali", "Veli"));
		ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("49", "50"));
		System.out.println(combineAL(wordList1, wordList2));

	}
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> wordListCombined = new ArrayList<>();
		wordListCombined.addAll(wordList1);
		wordListCombined.addAll(wordList2);
		return wordListCombined;
	}

}
