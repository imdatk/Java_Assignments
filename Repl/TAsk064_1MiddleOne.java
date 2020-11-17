package a_repl.A061_80;

import java.util.Scanner;

public class TAsk064_1MiddleOne {

	public static void main(String[] args) {
//		You have a word, do the following:
//
//			1. When word has odd number of characters and:
//			            - 3 or more characters, print middle letter
//			      oak ==> a
//			      javav ==> v
//			             - Single character, print that character 3 times
//			      # ==> ###
//			      q ==> qqq
//
//			2. When word has even number of characters and:
//			           - 4 or more characters, print middle 2
//			     java ==> av
//			     apples ==> pl
//			     #$%^&* ==> %^
//			           - 2 characters, print those 2 characters twice
//			      @@ ==>@@@@
//			      $$ ==>$$$$
//			      hi ==> hihi
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = scan.nextLine();
		scan.close();
		
		if(word.length()%2 != 0) {
			if(word.length()>=3) {
				System.out.println(word.substring((word.length()-1)/2,(word.length()-1)/2+1));
			}else if(word.length() == 1) {
				for(int i=1; i<=3; i++) {
					System.out.print(word);
				}
			}
		}else if(word.length()%2 == 0) {
			if(word.length()>=4) {
				System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
			}else if(word.length() == 2) {
				for(int i=1; i<=2; i++) {
					System.out.print(word);
				}
			}
		}

	}

}
