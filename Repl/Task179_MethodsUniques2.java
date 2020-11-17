package a_repl.A161_180;

public class Task179_MethodsUniques2 {

	public static void main(String[] args) {
	
		freqOfEachChar("javaaayytyttzzhhssaabbeeddsseenn");
	}

	private static void freqOfEachChar(String str) {
		String newStr = "";
		int counter = 0;
	
		for(int i=0; i<=str.length()-1; i++) {
			char eachChar = str.charAt(i);
			if(newStr.contains(""+eachChar)) {
				continue;
			}
			for(int j=0; j<=str.length()-1; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					counter++;
				}
			}
				newStr = newStr + str.charAt(i);
				System.out.println(str.charAt(i) + ":" + counter);
				counter = 0;
		}
			
		
	}

}
