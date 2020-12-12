package a_repl.A201_220;

import java.util.ArrayList;
import java.util.Arrays;

//Create a method that:
//
//is called twoTimes
//returns a new ArrayList of Integers
//takes in a single parameter - an ArrayList of Integers
//
//This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.
//
//For example, if the parameter is
//(1,5,3,7)
//The method should return a new ArrayList of Integers with
//(1,1,5,5,3,3,7,7)

public class Task215_ArrayList2Times {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,3,7));
		System.out.println(twoTimes(arr));
	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr) {
		for(int i=0;i<arr.size(); i++) {
			arr.add(i+1,arr.get(i));
			i++;
		}
		
		return arr;
		
	}

}
