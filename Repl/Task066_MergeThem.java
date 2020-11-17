package a_repl.A061_80;

import java.util.Scanner;

public class Task066_MergeThem {

	public static void main(String[] args) {
//		You have 2 words, both of them have 3 characters.
//		If either of them does not have exactly 3 characters, print "cannot merge"
//		Merge their characters one by one and print together like below:
//
//		aok
//		lol
//		alookl
//
//		ear
//		pie
//		epaire
//
//		java
//		wow
//		cannot merge
//
//		hint:
//		by inserting +""+ (empty string) between chars, you can concatenate char values.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		String word1 = scan.nextLine();
		System.out.println("Enter the second word: ");
		String word2 = scan.nextLine();
		scan.close();
		if(word1.length()!=3 || word2.length()!=3 ) {
			System.out.println("cannot merge");
		}else {
			System.out.println(word1.substring(0,1)+word2.substring(0,1)+word1.substring(1,2)+
								word2.substring(1,2)+word1.substring(2)+word2.substring(2));
			System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+
					word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2));
			System.out.println(word1.charAt(0)+""+word2.charAt(0)+word1.charAt(1)+  // sadece bir tanesine "" koymak yeterli.
					word2.charAt(1)+word1.charAt(2)+word2.charAt(2));
		}

	}

}
