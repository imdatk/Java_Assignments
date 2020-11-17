package a_repl.A101_120;

import java.util.Scanner;

public class Task109_ArraysPrinting {

	public static void main(String[] args) {
//		Example:
//			arr -> ["apple", "banana"] 
//			 prints: app
//			         ban
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone! :)   
		//assume you have String array of 5 items 
		//write your code below	 

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].substring(0,3));
		}
		
	}

}
