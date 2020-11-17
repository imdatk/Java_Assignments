package a_repl.A141_160;

import java.util.Random;
import java.util.Scanner;

public class Task152_Methods7Plus {
	
//	Create a method called plus_minus that gets an array of ints (int[]), 
//	it outputs how many negative , positive and zero numbers are in the array.
//
//	for example:
//
//	plus_minus (new int[]{1,2,55,-9,-2,0});
//
//	will output:
//	positives:3, negatives:2, zeros:1

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter array size:");
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    System.out.println("Enter array elements:");
	    for(int i=0 ;i<=size-1;i++)
	    {
	        arr[i]=inp.nextInt();
	    }
//	    Random arrh = new Random();  // random ürettirerek.
//	    for(int i=0 ;i<=size-1;i++)
//	    {
//
//	        arr[i]=arrh.nextInt(150)-50;
//	    }
	    
//	    for(int i=0 ;i<=size-1;i++) {   //array'i yazdirma.
//	    	System.out.println(arr[i]);
//	    }
	    
	    plus_minus(arr);
	    
	}

	private static void plus_minus(int[] arr) {
	int counterPositive = 0;
	int counterNegative = 0;
	int counterZero = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==0) {
				counterZero++;
			}else if(arr[i]<0) {
				counterNegative++;
			}else if(arr[i]>0) {
				counterPositive++;
			}
		}
		
		System.out.println("positives:"+ counterPositive + ", negatives:" + 
							counterNegative + ", zeros:" + counterZero);
	
	}

}
