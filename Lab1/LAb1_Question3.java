package day14_MethodsPart2;

public class LAb1_Question3 {

	public static void main(String[] args) {
//		We'll say a number is special if it is a multiple of 11 or 
//		if it is one more than a multiple of 11. Write a method that 
//		accepts a number and prints true if the given number is special.
//		specialEleven(22) → true
//		specialEleven(23) → true
//		specialEleven(24) → false
		
		specialEleven(22); 
		specialEleven(23); 
		specialEleven(24); 
		specialEleven(44);
		specialEleven(45);
		specialEleven(47);
		specialEleven(56); 


	}

	private static void specialEleven(int i) {
		if (i%11 ==0 || (i-1)%11 ==0) {
		System.out.println(true);
		}else {
		System.out.println(false);
		}
	}

}
