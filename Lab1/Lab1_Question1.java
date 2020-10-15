package day14_MethodsPart2;

public class Lab1_Question1 {

	public static void main(String[] args) {
//		Write a method that accepts a string and a non-negative number, and prints a larger string
//		that is number copies of the original String
//		stringTimes("Hi", 2); = > HiHi
//		stringTimes("Hi", 3); = > HiHiHi
//		stringTimes("Hi", 1); = > Hi

		stringTimes("*", 10);
		stringTimes("Hi", 9);
		stringTimes("Hi", 8);
		

	}

	private static void stringTimes(String string, int i) {

		for (int j=1; j<=i; j++) {
			System.out.print(string);
		}System.out.println();
		System.out.println(string.repeat(i));
		
	}

}
