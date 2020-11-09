package Assignment8;

public class Question04 {

	public static void main(String[] args) {

		printHollowRect();

	}

	private static void printHollowRect() {
		for (int i = 1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=4) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
						
				}else {
					System.out.print("*");
				}
				
				
			}System.out.println();
		}
		
	}

}
