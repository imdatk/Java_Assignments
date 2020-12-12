package a_repl.A201_220;

import java.util.ArrayList;
import java.util.Arrays;

//Create a static method that:
	//
	//is called appendPosSum
	//returns an ArrayList of Integers
	//takes one parameter: an ArrayList of Integers
	// 
	//This method should:
	//Create a new ArrayList of Integers
	//Add only the positive Integers to the new ArrayList
	//Sum the positive Integers in the new ArrayList and add the Sum as the last element
	//
	//For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), 
	//the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of 
	//(4,3,4,3).  The original ArrayList should remain unchanged.

public class Task201_ArrListAppendPosSum {

	public static void main(String[] args) {
		
		ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		
		System.out.println(appendPosSum(ints));

	}
	
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> ints) {
		ArrayList<Integer> newList = new ArrayList<>();
		for(Integer val : ints) {
			if(val>0) {
				newList.add(val);
			}
		}
		int sum =0;
		for(Integer val: newList) {
			sum+=val;
		}
		newList.add(sum);
		return newList;
		
	}

}
