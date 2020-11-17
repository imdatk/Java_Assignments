package a_repl.A181_210;

public class Task191_MethodsStringReverse {
//	reverse method reverse a string.
//	it gets a string and returns it in reverse.
//
//	for example:
//
//	reverse("foo") ==> "oof"
//
//	reverse("student") ==> "tneduts"

	public static void main(String[] args) {
		System.out.println(reverse("student"));

	}

private static String reverse(String input) {
	String newString="";
	for(int i=input.length()-1;i>=0;i--) {
		newString = newString + input.charAt(i);
	}
	return newString;
}

}
