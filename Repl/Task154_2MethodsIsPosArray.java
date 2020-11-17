package a_repl.A141_160;

import java.util.Scanner;

public class Task154_2MethodsIsPosArray {
//	isPos is a method that checks if  an int positive or not positive
//
//	1. If  the int num is positive print positive else print not positive
//
//	2. Complete main method by calling isPos method for each element in the array arr.

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    System.out.println("Enter array elements: ");
	    for(int i=0 ;i<=size-1;i++)
	    {
	        arr[i]=inp.nextInt();
	    }

	    //#2 Your code here
	    
	    isPos(arr);
	    
	    
	  }
	  
	  public static void isPos(int[] arr)
	  {
	    for(int i=0; i<arr.length;i++) {
	    	if(arr[i]>=0) {
	    		System.out.println(arr[i]+ " is positive");
	    	}else {
	    		System.out.println(arr[i]+ " is negative");
	    	}
	    	
	    }
	   
	  }

}
