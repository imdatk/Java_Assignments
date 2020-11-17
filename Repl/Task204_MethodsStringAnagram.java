package a_repl.A181_210;

public class Task204_MethodsStringAnagram {
//	Anagram is a word, phrase, or name formed by rearranging the letters of another,
//	such as cinema, formed from iceman.
//
//	isAnagram method checks if word1 and word2 are anagram to each other then return 
//	a boolean.
//
//	each letter in word1 should appear in word2 exact number of times
//	ignore empty spaces
//	make your code case insensitive
//
//	Examples:
//
//	isAnagram("listen", "Silent") ==> true
//
//	isAnagram("earth", "heart") ==> true
//
//	isAnagram("star", "rats") ==> true
//
//	isAnagram("hi", "bye") ==> false
//
//	isAnagram("java", "cava") ==> false
	

	public static void main(String[] args) {
		System.out.println(isAnagram("javtaczy", "ajvactyz"));
		
	}

	private static boolean isAnagram(String word1, String word2) {
		word1= word1.replace(" ", "").toUpperCase();
		word2= word2.replace(" ", "").toUpperCase();
		boolean flag = false;
		if(word1.length()!=word2.length()) {
			return flag;
		}else {
			for(int i=0; i<=word1.length()-1; i++) {
//				if(word2.contains(word1.substring(i,i+1))) { //bu da calisiyor, asagidaki daha kolay.
				if(word2.contains(""+ word1.charAt(i))) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		
		}
		return flag;
	
	
}

}
