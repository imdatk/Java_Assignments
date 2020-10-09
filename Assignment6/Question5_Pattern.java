package Assignment6;

public class Question5_Pattern {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1111111
//		1111122
//		1111333
//		1114444
//		1155555
//		1666666
//		7777777

		int x=1;
		int y=1;
		for (int i=1; i<=7; i++) {
				for (int j=6; j>=i; j--) {
					System.out.print(x);
					}
				for(int l=1; l<=i; l++) {
					System.out.print(y);
				}
				y++;
				System.out.println();
		}
				
	}
}
