package a_repl.A121_140;

import java.util.Arrays;
import java.util.Scanner;

//Write a program that will find out shortest words in the given string str. 
//If there are few words that are evenly short, print them all. Use split method in 
//order to split str string variable and create an array of strings.  Print array 
//with Arrays.toString() method. Sort array before printing. 
//Split values by comma: split(", ");
//input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//output: [cat, old, ray]

public class Task126_ArraysPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
		
//		String str1 = "volt, olive, fish, hot pursuit, warning, python, java, coffee, part";
//	    String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
	    String[] strArr = str.split(",");
//	    String[] strArr1 = str1.split(",");
//	    System.out.println(Arrays.toString(strArr));
	    String min = strArr[0].trim();
	    for(int i=0;i<strArr.length; i++) {
	    	if(min.length()>strArr[i].trim().length()) {
	    		min = strArr[i].trim();
	    	}
	    }
//	    System.out.println("------------");
//	    System.out.println(min);
	    
//	    String min1 = strArr1[0].trim();
//	    for(int i=0;i<strArr1.length; i++) {
//	    	if(min1.length()>strArr1[i].trim().length()) {
//	    		min1 = strArr1[i].trim();
//	    	}
//	    }
//	    System.out.println("------------");
//	    System.out.println(min1);
//	    System.out.println("******");


//	    Yöntem 1:
//	    int counter=0;
//	    for(String val : strArr) {
//	    	if(val.trim().length()==min.length()) {
//	    		counter++;
//	    	}	    	
//	    }
//	    System.out.println(counter);
////	    
////	    
//	    String[] outPut = new String[counter];
//	    int y=0;
//	    for(String val : strArr) {
//	    	if(val.trim().length()==min.length()) {
//	    		outPut[y] = val;
//		    	y++;
//	    	}	    	
//	    }
	    
//	    Yöntem 2:
	    String newStr = "";
	    for(String val : strArr) {
	    	if(val.trim().length()==min.length()) {
	    		newStr = newStr + val.trim() + ",";
	    	}	    	
	    }
	    
//	    System.out.println(newStr);
//	    System.out.println("---------");
	    String[] outPut = newStr.split(",");
	    
	    
	    Arrays.sort(outPut);
	    System.out.println(Arrays.toString(outPut));
	    
//	    String newStr1 = "";
//	    for(String val : strArr1) {
//	    	if(val.trim().length()==min1.length()) {
//	    		newStr1 = newStr1 + val.trim() + ",";
//	    	}	    	
//	    }
//	    System.out.println(newStr1);
//	    String[] outPut1 = newStr1.split(",");
//	    
//	    
//	    Arrays.sort(outPut1);
//	    System.out.println(Arrays.toString(outPut1));
	}

}
