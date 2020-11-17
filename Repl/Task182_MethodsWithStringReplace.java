package a_repl.A181_210;

public class Task182_MethodsWithStringReplace {
	
//	This method gets two strings (text and badWord)  and returns a string.
//	basicly what it dose is take out all the occurrences of badWord in text.
//
//	for example:
//	clean ("one two three","two")
//	returns "one three"
//
//	clean ("foo bar","foo")
//	returns "bar"
//
//	clean ("he said bla bla bla","bla")
//	returns "he said "

	public static void main(String[] args) {
		System.out.println(clean ("one two three","two "));

	}

	private static String clean(String text, String badWord) {
		text = text.replace(badWord, "");
		return text;
	
	
	}

}
