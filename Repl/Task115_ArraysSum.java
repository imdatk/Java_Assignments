package a_repl.A101_120;

import java.util.Scanner;

public class Task115_ArraysSum {

	public static void main(String[] args) {
//		Given an array num, calculate the sum of all numbers in nums and print out to console.
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	
	    int sum = 0;
	    for(int x : nums) {
	    	sum =sum + x;
	    }
	    System.out.println(sum);
	
	}

}
