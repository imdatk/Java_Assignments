package a_repl.A121_140;

import java.util.Arrays;

public class Task129_ArraysCopyCertainValues {
//	Given a String array arr with the following elements
//	["zero", "one", "two","three","four"]
//
//	Create another array fewValues and copy words that have letter "e" in them
//
//	You need to know how many element contain "e" and create array accordingly
//
//	Values in fewValues array need to be["zero", "one","three"]
//
//	Examples:
//	arr -> ["aa", "be", "lol", "lel", "oreo"] 
//	fewValues -> ["be",  "lel", "oreo"] 
//
//	arr -> ["e", "hey", "bye", "furey", "spoon"] 
//	fewValues ->["e", "hey", "bye", "furey"] 
	
	public static void main(String[] args) {
	    System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	    int counter = 0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i].contains("e")) {
				counter++;
			}
		}
		String[] fewValues = new String[counter];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains("e")) {
				fewValues[j]=arr[i];
				j++;
			}
		}
	    
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }

}
