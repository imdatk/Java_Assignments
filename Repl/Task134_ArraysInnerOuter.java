package a_repl.A121_140;

import java.util.Arrays;
import java.util.Scanner;

public class Task134_ArraysInnerOuter {
//	Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the 
//	numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.
//	Example:
//	input (outer): 1, 2, 4, 6
//	input (inner): 2, 4
//	output: true
//
//	Example:
//	input (outer): 1, 2, 4
//	input (inner): 6, 5
//	output: false

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		//WRITE YOUR CODE HERE
		int counter =0;
		for(int i=0; i<inner.length; i++) {
			for(int j=0; j<outer.length;j++) {
				if(inner[i]==outer[j]) {
					counter++;
					break;
				}
			}
		}
		if(inner.length == counter) {
			System.out.println(true);
		}else {System.out.println(false);
		}
	}

}
