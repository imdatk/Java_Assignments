package a_repl.A161_180;

import java.util.Scanner;

public class Task172_2DArrDiagonalDiff {

	public static void main(String[] args) {
//		Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//		For example, the square matrix  is shown below:
//		1 2 3 4
//		4 5 6 7
//		9 8 4 1
//		7 7 4 5
//
//		The left-to-right diagonal = 1+5+4+5 = 15. The right to left diagonal =  4+6+8+7 = 25. 
//		Their absolute difference is |20-21| = 1.
		
		Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()}
	                            };
	    int result = 0;
	    
	    int sum1 = 0, sum2 = 0;
	    for(int i=0; i<matrix.length; i++) {
	    	for(int j=0; j<matrix[i].length; j++) {
	    		if(i==j) {
	    			sum1+= matrix[i][j];
	    		}
	    		if(i+j == matrix.length-1) {
	    			sum2+= matrix[i][j];
	    		}
	    	}
	    }
	    System.out.println(sum1);
	    System.out.println(sum2);
	    result = sum1 - sum2;
	    
	    // FINAL PRINT
	    System.out.println(Math.abs(result));

	}

}
