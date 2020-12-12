package a_repl.A201_220;

import java.util.ArrayList;
import java.util.Arrays;

public class Task202_ArrListTimesTwo {
	
	public static void main(String[] args) {
//		Create a method that:
//		is called timesTwo
//		returns nothing
//		takes in a single parameter - an ArrayList of Integers called nums
//
//		This method should take the ArrayList parameter and multiply every value by two.
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		timesTwo(nums);

	}

	private static void timesTwo(ArrayList<Integer> nums) {
		for(int i=0; i<nums.size();i++) {
			nums.set(i, nums.get(i)*2);
		}
		System.out.println(nums);
	}

}
