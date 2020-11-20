package Assignment9;

import java.util.Scanner;

public class Question05_2Words {

	public static void main(String[] args) {
//		You have 2 words, both of them have 3 characters. If either of them does not have exactly
//		3 characters, print "cannot merge" Merge their characters one by one and print together 
//		like below:
//			Sample Output:
//			     aok
//			     lol
//			     alookl
//			     ear
//			     pie
//			    epaire
//			    java
//			    wow
//			    cannot merge
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
		}
		


	}

}
