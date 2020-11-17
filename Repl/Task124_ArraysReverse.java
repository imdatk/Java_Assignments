package a_repl.A121_140;

import java.util.Arrays;
import java.util.Scanner;

public class Task124_ArraysReverse {

	public static void main(String[] args) {
//		Given an array nums with 7 integers already assigned, write code to reverse it.
//		Do not use any additional arrays or Strings.
//
//		Example:
//
//		nums -> [4, 3, 2, 44, 1, 100, 55]
//		change it to:
//		nums -> [55, 100, 1, 44, 2, 3, 4]
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

//	    birinci yöntem
//	    int swap = nums[0];
//	    nums[0]=nums[nums.length-1];
//	    nums[nums.length-1]=swap;
//	    
//	    swap = nums[1];
//	    nums[1]=nums[nums.length-2];
//	    nums[nums.length-2]=swap;
//	    
//	    swap = nums[2];
//	    nums[2]=nums[nums.length-3];
//	    nums[nums.length-3]=swap;
	    
	    for(int i=0;i<nums.length/2; i++) {
	    	int swap = nums[i];
		    nums[i]=nums[nums.length-1-i];
		    nums[nums.length-1-i]=swap;
	    }
	    
	    
	    
	    
	    
	    System.out.println(Arrays.toString(nums));
	}

}
