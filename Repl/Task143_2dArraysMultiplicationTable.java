package a_repl.A141_160;

import java.util.Arrays;

public class Task143_2dArraysMultiplicationTable {

	public static void main(String[] args) {
//		Two-dimensional Arrays - 2D array has a type such as int[][] or String[][], with two pairs of square brackets. 
//		The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies both 
//		the number of rows and the number of columns.
//
//		You have  2D array multiplicationTable declared with 10 rows and 10 columns.
//		Write java program to populate the array with multiplication table values like in the picture below:
		
		int[][] multiTable = new int[10][10];
		
		for(int i=0; i<multiTable.length;i++) {
			for(int j=0; j<multiTable[i].length; j++) {     // 1, 2, 3  / 2, 4, 6 20 21 22
				multiTable[i][j]= (j+1)*(i+1);
			}
		}
//		System.out.println(Arrays.deepToString(multiTable));
		
		for(int[] arr : multiTable) {
			System.out.println(Arrays.toString(arr));
		}


	}

}
