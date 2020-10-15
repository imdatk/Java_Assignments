package day14_MethodsPart2;

public class Lab1_Question6 {

	public static void main(String[] args) {
//		When chipmonks get together for a party, they like to have cigars. 
//		A chipmonk party is successfull when the number of cigars is between 40 and 60. 
//		If it is the weekend there is no upper bound on the number of cigars. 
//		Write a method that accepts number of cigars and a boolean for weekend, 
//		and prints true if the party with the given values is successful, or false otherwise.
//		cigarParty(30, false) → false
//		cigarParty(50, false) → true
//		cigarParty(70, true) → true
		
		cigarParty(30, false); 
		cigarParty(50, false); 
		cigarParty(70, true); 


	}

	private static void cigarParty(int numCigars, boolean weekend) {
		if (weekend) {
			if (numCigars>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}else {
			if (numCigars>=40 && numCigars <=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
		
	}

}
