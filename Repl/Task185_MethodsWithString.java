package a_repl.A181_210;

public class Task185_MethodsWithString {
//	the method gets two strings and return the longest one
//
//	biggerS("apple","orange") ==> "orange"

	public static void main(String[] args) {
		biggerS("apple","orange");

	}

	private static String biggerS(String a, String b) {
		int x=a.length();
		int y=b.length();
		if(x>y) {
			return a;
		}else {
			return b;
		}
		
	}

}
