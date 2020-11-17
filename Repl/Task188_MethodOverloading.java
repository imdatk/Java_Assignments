package a_repl.A181_210;

public class Task188_MethodOverloading {

	public static void main(String[] args) {
//		In this task, you need to write 2 methods findMax() that will find a maximum number 
//		in the array. First method should work with array of integers (int[]) and return int,
//		and second method should work with an array of doubles (double[]) and return double 
//		as a result.
//		
//		Methods must have the same name and different parameters.
//		Comment: Methods should be non static and with a return type.
		int[] x = {10,15,8,15,20};
		double[] y = {15,20, 13, 8, 32,4};
		System.out.println(findMax(x));
		System.out.println(findMax(y));

	}

	private static int findMax(int[] x) {
		int max = x[0];
		for(int i=0; i<x.length;i++) {
			if(x[i]>max) {
				max = x[i];
			}
		}
		return max;
		
	}

	private static double findMax(double[] x) {
		double max = x[0];
		for(int i=0; i<x.length;i++) {
			if(x[i]>max) {
				max = x[i];
			}
		}
		return max;
		
	}

}
