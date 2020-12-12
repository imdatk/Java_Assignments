package a_repl.A201_220;

import java.util.Arrays;

import a_repl.A181_200.Utils;

public class Task210_MethodsStringReverse {
//	Reverse a string without affecting special characters
//	Given a string, that contains special character together with alphabets 
//	(‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special 
//	characters are not affected.
//
//	Input:   str = "a,b$c"
//	Output:  str = "c,b$a"
//	Note that $ and , are not moved anywhere.  
//	Only subsequence "abc" is reversed.

//	Input:   str = "Ab,c,de!$"
//	Output:  str = "ed,c,bA!$"
//
//	Input:   str = "----qwe--r--tyf...gd.---" 
//	Output:  str = "----dgf--y--tre...wq.---" 

	public static void main(String[] args) {   
		
		 String result = Utils.reverseLetters("..zxcv..d"); 
		 System.out.println(result.equals("..dvcx..z")); //true
		    
		 String result2 = Utils.reverseLetters("---abmkl.o-");
		 System.out.println(result2.equals("---olkmb.a-")); //true
		    
		 String result3 = Utils.reverseLetters("---abmkl.o-");
		 System.out.println(result3.equals("-o.lkmba---")); //false
		 
//		 String word = "a,b$c"; 
//		 String newStr = "", reverseString ="";
//		 
//		 
//		 for(int i=0; i<word.length(); i++) {
//			 if((word.charAt(i)>='a' && word.charAt(i)<='z')||(word.charAt(i)>='A' && word.charAt(i)<='Z')  )
//			 newStr = newStr +word.charAt(i);
//		 }
//		 for(int i=newStr.length()-1; i>=0; i--) {
//			 reverseString = reverseString +newStr.charAt(i);
//		 }
//		 
//		 System.out.println(reverseString);
//		 String strReverse = "";
//		 int y=0;
//		 for(int i=0; i<word.length(); i++) {
//			 if((word.charAt(i)>='a' && word.charAt(i)<='z')||(word.charAt(i)>='A' && word.charAt(i)<='Z')) {
//				 strReverse = strReverse +reverseString.charAt(y);
//				 y++;
//				 continue;
//			 }
//			 strReverse = strReverse + word.charAt(i);
//		 }
//		 System.out.println(strReverse);
	}
	

}
