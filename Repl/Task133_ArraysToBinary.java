package a_repl.A121_140;

import java.util.Arrays;
import java.util.Scanner;
//Binary number is a number expressed in the base-2 numeral system or binary numeral system, which uses only two symbols: 
//typically 0 (zero) and 1 (one). Each digit is referred to as a bit.
//
//Given an int variable decimal,  write java program to calculate binary value of the decimal variable and assign it 
//binary array. print out value of binary array matching below format. Feel free to use additional arrays or formulas.
//
//Example:
//decimal -> 3
//binary -> [0, 0, 0, 0, 0, 0, 1, 1]
//
//decimal -> 35
//binary -> [0, 0, 1, 0, 0, 0, 1, 1]
//
//decimal -> 255
//binary -> [1, 1, 1, 1, 1, 1, 1, 1]

public class Task133_ArraysToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int decimal = input.nextInt();
		int x=Integer.MIN_VALUE;
		int y=1;
	    
	    int[] binary = new int[8];
	    while(decimal>0) {
	    	x = decimal%2;
	    	binary[binary.length-y]=x;
	    	decimal = decimal/2;
	    	y++;	    	
	    	
	    }
	    System.out.println(Arrays.toString(binary));
	    
	    
	    //TODO: Write your code below.
//	    String binaryString = Integer.toBinaryString(35);
//	    for(int i=0; i<binaryString.length();i++) {
//	    	binary[i]= binaryString.charAt(i);
//	    }
//	    System.out.println(Arrays.toString(binary));

	}

}
