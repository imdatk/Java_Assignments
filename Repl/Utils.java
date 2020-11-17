package a_repl.A181_210;

import java.util.Arrays;

public class Utils {
	public static String reverseLetters(String word){
//		basit method.
		String newStr = "", reverseString ="";
		for(int i=0; i<word.length(); i++) {
			 if((word.charAt(i)>='a' && word.charAt(i)<='z')||(word.charAt(i)>='A' && word.charAt(i)<='Z')  )
			 newStr = newStr +word.charAt(i);
		 }
		 for(int i=newStr.length()-1; i>=0; i--) {
			 reverseString = reverseString +newStr.charAt(i);
		 }
		 String strReverse = "";
		 int y=0;
		 for(int i=0; i<word.length(); i++) {
			 if((word.charAt(i)>='a' && word.charAt(i)<='z')||(word.charAt(i)>='A' && word.charAt(i)<='Z')) {
				 strReverse = strReverse +reverseString.charAt(y);
				 y++;
				 continue;
			 }
			 strReverse = strReverse + word.charAt(i);
		 }
		 word = strReverse;
		return word;
	}
	public static String reverseLetters1(String word){
//		komplex method.
    	 char[] charArr = word.toCharArray();
//		 System.out.println(Arrays.toString(charArr));
//    	 String word = "..zxcv..d";     
		int x =0 , y=charArr.length-1;
    	 while(y>x) {
    		 if(!Character.isAlphabetic(charArr[x])){  // x alfabetic degilse
    			 x++;
    		 }else if(!Character.isAlphabetic(charArr[y])){ // y alfabetic degilse
    			 y--;
    		 }else{        // ikisi de alfabetikse
    			 char temp = 0;
    			 temp = charArr[x];
    			 charArr[x] =  charArr[y];
    			 charArr[y] = temp;
    			 x++;
    			 y--;
    			 
    		 };
    	 word = new String(charArr); 
    	 }
    	return word;
	}
}
