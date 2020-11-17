package a_repl.A181_210;

public class Task184_MethodsWithString {
//	at3 gets two strings and returns a string.
//
//	the first string is the one that will be manipulated. at the 3rd char 
//	position of target you will insert the word argument.
//
//	example use:
//
//	at3("longword","foo")
//	will return: "lonfoogword"
//
//	at3("blabla","a")
//	will return: "blaabla"

	public static void main(String[] args) {

		System.out.println(at3("longword","foo"));

	}

private static String at3(String str1, String str2) {

	str1 = str1.substring(0,3)+str2 + str1.substring(3);
	return str1;
}

}
