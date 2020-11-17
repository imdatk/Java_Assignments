package a_repl.A141_160;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Task142_2DArrayLargest {

	public static void main(String[] args) {
//		Given a 2d array of ints, find the biggest number(int) in the array and print it.
		
		Scanner scan = new Scanner(System.in);
	    int rows = scan.nextInt(), cols = scan.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=scan.nextInt();
	      }//end for cols
	    }//end for rows
	    
//	    write your code below
	    int max = arr[0][0];
	    for(int i=0 ;i<=rows-1;i++){
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        if(arr[i][j]>max) {
	        	max = arr[i][j];
	        }
	      }
	    }
	    System.out.println(max);

	}

}
