package a_repl.A121_140;

import java.util.Scanner;

public class Task122_ArraysNonDuplicate {
//	Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    for(int i=0;i<nums.length;i++) {
	    	int counter =0;
	    	for(int j=0; j<nums.length;j++) {
	    		if(nums[i]==nums[j]) {
	    			counter++;
	    		}
	    	}
	    	if(counter==1) {
	    		System.out.println(nums[i]);
	    		break;
	    	}
	    }
	    
	}

}
