package a_repl.A121_140;

import java.util.Scanner;

public class Task121_ArraysCountEvens {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		int count = 0;
	    for(int x : nums) {
	    	if(x%2==0) {
	    		count++;
	    	}
	    }
	    System.out.println(count);

	}

}
