package a_repl.A121_140;

import java.util.Arrays;
import java.util.Scanner;

public class Task130_ArraysShiftLeft {
//	Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
//	You may modify and print the given array, or print a new array.
//	Example: 
//	input: 6, 2, 5, 3
//	output: [2, 5, 3, 6]

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] nums = new int[size];
    for(int i = 0; i < size; i++){
      nums[i] = scan.nextInt();
    }
    //WRITE YOUR CODE HERE		
    int[] arrNew = new int[nums.length];
	for(int i=0; i<arrNew.length-1; i++) {
		 arrNew[i] = nums[i+1];
	}
	arrNew[arrNew.length-1]=nums[0];
	System.out.println(Arrays.toString(arrNew));

	}

}
