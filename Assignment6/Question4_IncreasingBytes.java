package Assignment6;

public class Question4_IncreasingBytes {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1
//		10
//		101
//		1010
//		10101
//		101010
//		1010101
		
		for (int i=1;i<=7;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}


	}

}
