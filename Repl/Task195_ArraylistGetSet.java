package a_repl.A181_200;

import java.util.ArrayList;
import java.util.Arrays;

//The next two methods are .size() and .get().
//If we have an ArrayList called someList and an Array called arr, these two
//pretty much do the same thing:
//someList.size()
//arr.length
//
//In other words, .size() returns the length (size) of the list.
//The method .get(i) will return the element found at index i. The following two
//expressions also do the same thing:
//someList.get(4)
//arr[4]
//
//On the left, given an ArrayList of Integers called ints, find and return
//the sum of all the Integers in ints.

public class Task195_ArraylistGetSet {

	public static void main(String[] args) {
	
		ArrayList<Integer> someList = new ArrayList<>(Arrays.asList(1,2,3,5,8,9));
		
		System.out.println(sum(someList));
		
		
	}
	public static int sum(ArrayList<Integer> ints) {
		int sum = 0;
		for (int i=0;i<ints.size(); i++) {
				sum+=ints.get(i);
			}
		return sum;
	}
		

}
