package a_repl.A181_210;

public class Task181_MethodsWithStringSplit {
	
//	This method gets a string and returns the word count of that string.
//
//	example:
//
//	wordCount("foo bar")
//	returns 2
//
//	wordCount("one two three")
//	returns 3
//
//	wordCount("bla")
//	returns 1

	public static void main(String[] args) {
		
		int n = wordCount("one two three");
		System.out.println(n);

	}

	private static int wordCount(String str) {
		String count[] = str.split(" ");  // nereden bölmek istiyorsan orayi yaziyorsun
		String count2[] = str.split(str.substring(3, 8));
		int n= count.length;
		System.out.println(count[1]);
		System.out.println(count2[0]);
		return n;
	}



	

}
