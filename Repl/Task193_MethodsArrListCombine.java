package a_repl.A181_200;

import java.util.ArrayList;
import java.util.Arrays;

//We will be manipulating elements of an ArrayList by using List methods.
//
//The first List method we will learn is .add()
//
//The following code will take an ArrayList of Strings called strs and add "Hello" to it.
//str.add("Hello");
//
//The syntax follows something like:
//arraylistvariable.add(data to add);
//
//In the space to the left, add three names (any names) to the ArrayList called names.

public class Task193_MethodsArrListCombine {

	public static void main(String[] args) {
		String[] arr1 = {"1","2","3"};
		String[] arr2 = {"5","6","7"};
		
		System.out.println(combineRs(arr1,arr2));

	}
	
	public static String combineRs(String[] r1,String[] r2){
	    String str ="";
		  ArrayList<String> newList = new ArrayList<>();
		  newList.addAll(Arrays.asList(r1));
		  newList.addAll(Arrays.asList(r2));
		  for(String val : newList) {
			  str+=val;
		  }
		  return str;
	 }

}
