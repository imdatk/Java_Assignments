package a_repl.A141_160;

import java.util.Scanner;

public class Task159_MethodsArraysUnique {
//	Write a void method printUniqueNumbers that will print unique numbers from an 
//	array of ints.
//
//	Example:
//	input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
//	output:
//	2
//	9
//	34

	public static void main(String[] args) {
		
//		int arr[] = {2, 5, 5, 6, 3, 6, 9, 34, 3};
//		input(arr);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size: ");
	    int size = scan.nextInt();
	    int[] nums = new int[size];  // yeni bir array olusturma.
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
		
		

	}

	private static void printUniqueNumbers(int[] nums) {
		int counter =0;
		for(int i = 0; i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					counter++;
				}
			}
			if(counter==1) {
				System.out.println(nums[i]);
			}
			counter = 0;
		}
		
		
	
}

}
