package a_repl.A161_180;

import java.util.Scanner;

public class Task174_MethodsPrintUniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    //WRITE YOUR CODE HERE
		for(int i=0; i<nums.length; i++) {
			int counter =0;
			for(int j=0; j<nums.length; j++) {
				if(nums[j]==nums[i]) {
		    		counter++;
		    	}
	    		
	    	}
	    	if(counter==1) {
	    		System.out.println(nums[i]);
	    	}
	    }

	}

}
