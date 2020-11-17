package a_repl.A181_210;

public class Task186_MethodsWithString9 {

	public static void main(String[] args) {
//		The method gets a string and returns a string minus the first string.
//
//		for example:
//
//		removeFirst("aaa")
//		returns "aa"
		
		System.out.println(removeFirst("aaa"));

	}

	private static String removeFirst(String target) {
		target = target.substring(1);
		return target;
		
	}

}
