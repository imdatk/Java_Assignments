package a_repl.A141_160;

public class Task150_Methods5SimplePrintPttern {

	public static void main(String[] args) {
//		Create a method printHollowRect that prints a 5 on 5 hollow rectangle:			 
//			*****
//			*   *
//			*   *
//			*   *
//			*****
//		hint:you will need to use two nested for loops for that, and an if that checks 
//		if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
		
		printHollowRect();

	}

	private static void printHollowRect() {
		
		for (int i =1; i<=5; i++) {
			
				for(int j=1; j<=5; j++) {
					
					if(i>=2 && i<=4) {
						if(j>=2 && j<=4) {
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
					}else {
						System.out.print("*");
					}

				}System.out.println();
		}
		
	}
	
}
