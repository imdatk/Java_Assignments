package a_repl.A101_120;

import java.util.Scanner;

public class Task116_ArraysEvens {

	public static void main(String[] args) {
//		Given an array nums, calculate the count of even numbers in nums and print out to console.
		Scanner input = new Scanner(System.in);
	    int[] nums = new int[10];
	    for(int i = 0 ; i<=9 ; i ++){
	      nums[i] = input.nextInt();
	    }
	    int count = 0;
	    for(int x : nums) {
	    	if(x%2==0) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}

}
