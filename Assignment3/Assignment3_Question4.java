package assignments.day04;

public class Assignment3_Question4 {

	public static void main(String[] args) {
		/* Declare 2 variables (Num1, Num2)
		 * Swap values between Num1 and Num2
		 * Display new values of Num1 and Num2
		 * Sample output: 
		 * n1=10
		 * n2=20
		 * ----------
		 * n1=20
		 * n2=10 */
		
		int num1 =5, num2=8;
		System.out.println("n1 = " + num1 + "\nn2 = " + num2);
		num1 = num2;
		num2 = 5;
		System.out.println("------");
		System.out.println("n1 = " + num1 + "\nn2 = " + num2);

	}

}
