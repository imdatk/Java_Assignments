package day14_MethodsPart2;

public class Lab1_Question5 {

	public static void main(String[] args) {
//		You are driving a little too fast, and a police officer stops you.
//		Write a method to compute the result: 0=no ticket, 1=small ticket, 2=big ticket.
//		If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
//		If speed is 81 or more, the result is 2. 
//		If it is your birthday -- on that day, your speed can be 5 higher in all cases.
//				caughtSpeeding(60, false) → 0
//				caughtSpeeding(65, false) → 1
//				caughtSpeeding(65, true) → 0
		
		caughtSpeeding(60, false); 
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
		
	}

	private static void caughtSpeeding(int speed, boolean birthday) {
		int result;
		if (birthday) {
			if (speed <=65) {
				result = 0;
				System.out.println(result);
			}else if (speed>65 && speed<=85) {
				result = 1;
				System.out.println(result);
			}else {result =2; System.out.println(result);}
		}else {
			if (speed <=60) {
				result = 0;
				System.out.println(result);
			}else if (speed>60 && speed<=80) {
				result = 1;
				System.out.println(result);
			}else {result =2; System.out.println(result);}
			
		}
		
	}

}
