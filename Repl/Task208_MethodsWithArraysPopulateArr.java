package a_repl.A201_220;

import java.util.Arrays;

public class Task208_MethodsWithArraysPopulateArr {
//	populate method accepts an empty int array and populates it with numbers counting up.
//
//	for example:
//
//	populate(new int[3])
//	returns:[1,2,3]
//
//	populate(new int[5])
//	returns:[1,2,3,4,5]
//
//	hint:
//	use a for loop and use the iterator as the current elements value.
	
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[10]; 
    i= populate(i) ;
    System.out.println(Arrays.toString(i));

	}
	
	public static int[] populate(int[] r) 
	{
		for(int i=0; i<r.length;i++) {
			r[i]=i+1;
		}
	return r;
		
	}
	
	

}
