package a_repl.A141_160;

import java.util.Arrays;

public class Task145_2DArraysDeclareAndCreate {
//	Declare and create a two-dimensional array of ints called values, with 2 rows, and initialize
//	the first row to 8, 20, 50 and the second row to 12, 30, 75.

	public static void main(String[] args) {
//		WRITE YOUR CODE HERE
		int[][] values = new int[2][];
		values[0]= new int[3];
		values[1]= new int[3];
		values[0][0] = 8;
		values[0][1] = 20;
		values[0][2] = 50;
		values[1][0] = 12;
		values[1][1] = 30;
		values[1][2] = 75;
		
	    
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(values));

	}

}
