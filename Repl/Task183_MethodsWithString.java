package a_repl.A181_210;

public class Task183_MethodsWithString {
	
//	This method gets a string and an int, it returns a string.
//	what it dose is limit the inputted string to a cretin number of characters.
//
//	for example:
//	limit("abcd",2)
//	returns "ab"
//
//	limit("bla bla",3)
//	returns "bla"


	public static void main(String[] args) {
		System.out.println(limit("bla bla",2));

	}
	
	public static String limit(String text, int maxLength){
	    text = text.substring(0, maxLength);
	    return text;
	
	}

}
