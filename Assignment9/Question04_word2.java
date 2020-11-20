package Assignment9;
import java.util.Scanner;

public class Question04_word2 {

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
		String word = scan.nextLine();
		scan.close();
		
		if(word.length()%2 != 0 && word.length()>=5) {
			System.out.println(word.substring((word.length()-1)/2-1,(word.length()-1)/2+2));
		}else {
				System.out.println("invalid");
		}


	}

}
