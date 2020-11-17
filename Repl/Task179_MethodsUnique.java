package a_repl.A161_180;

public class Task179_MethodsUnique {

	public static void main(String[] args) {
//		uniqueChars is a method that you will code now, should be able to accept any 
//		string in the world and return unique characters from the parameter.
//
//				Examples:
//				uniqueChars("java") ==> "jav"
//
//				uniqueChars("mama") ==> "ma"
//
//				uniqueChars("spoon") ==> "spon"
		
		System.out.println(uniqueChars("java"));
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("spoon"));

	}

	private static String uniqueChars(String str) {
		String newStr = "";
	
		for(int i=0; i<=str.length()-1; i++) {
			char eachChar = str.charAt(i);
			if(newStr.contains(""+eachChar)) {
				continue;
			}
				newStr = newStr+str.charAt(i);
		}
			
		return newStr;
		
	}

}
