package a_repl.A161_180;

public class Task178_MethodsWithStringMerging {
	
//	When gears merge and work together, one teeth from each one goes in order.
//	Write a method mergeStrings hat will return the strings merged, one letter at a time, 
//	starting with one.   Please note one and two can be of different lengths. Please look 
//	at below examples:
//
//	s1 ==> "12345"
//	s2 ==> "abcde"
//	mergeStrings(s1,s2) ==> "1a2b3c4d5e"
//
//	mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
//
//	mergeStrings("java", "selenium") ==> "jsaevlaenium"

	public static void main(String[] args) {
		String merged = mergeStrings("java","selenium");
		System.out.println(merged);
	}
	
	
	public static String mergeStrings(String one, String two) {
		String merged = "";
		
		if(one.length()>two.length()) {
			for(int i = 0; i<=one.length()-1; i++) {
		    	merged = merged + one.charAt(i);
		    	if(i<=two.length()-1) {
	    		merged = merged + two.charAt(i);
		    	}
			}
		}else {
			for(int i = 0; i<=two.length()-1; i++) {
		    	if(i<=one.length()-1) {
		    		merged = merged + one.charAt(i);
		    	}
		    	merged = merged + two.charAt(i);
			}
		}
		return merged;

	}
	    
	    
}
