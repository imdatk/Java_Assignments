package a_repl.A181_200;

import java.util.ArrayList;
import java.util.Arrays;

//	The next ArrayList method we are going to learn is .remove()
//	The .remove(i) method will remove the element at index i. This means that all 
//	elements after index i will be shifted back to fill the hole left by the removal.
//	
//	On the left, write code that will remove the first two elements in an ArrayList of
//	doubles (be careful, this is a little tricky!)
//	
//	As an example, say you had an ArrayList called nums with values (6,2,3,1,9,2,5).
//	Running the following code:
//	nums.remove(1);
//	will result in (6,3,1,9,2,5).  Running the following code again:
//	nums.remove(3);
//	nums.remove(3);
//	will result in (6,3,1,5), because after the first remove(3) is run, the 2 and 5
//	get pushed up into the 3rd and 4th index, and then the second remove(3) will remove
//	the 2, leaving the 5. 

public class Task196_ArrListRemove {

	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<>(Arrays.asList(6.0,2.0,3.0,1.0,9.0,2.0,5.0));
		test(nums);

	}
	public static void test(ArrayList<Double> dubs)
	{
		//write code here
		dubs.remove(0);
		dubs.remove(0);		
		System.out.println(dubs);
		
	}

}
