package Assignment5;

public class Question13_NesteBW {

	public static void main(String[] args) {
//		Print following chessboard using nested for loops.
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//
//		NOTE:
//		1. Total 8 rows and 8 columns.
//		2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
		
//		for (int i=1; i<=4; i++) {
//			for (int j=1; j<=4; j++) {
//			System.out.print("W B ");
//			}System.out.println();
//			for (int j=1; j<=4; j++) {
//				System.out.print("B W ");
//				}System.out.println();
//		}
		
		for (int k=1; k<=4; k++) {
			for (int i=1; i<=4; i++) {
			
				for (int j=1; j<=1; j++) {
				System.out.print("W ");
				}
				for (int j=1; j<=1; j++) {
					System.out.print("B ");
				}
			}	
			System.out.println();
			for (int i=1; i<=4; i++) {
				
				for (int j=1; j<=1; j++) {
				System.out.print("B ");
				}
				for (int j=1; j<=1; j++) {
					System.out.print("W ");
				}
			}	
			System.out.println();
		
		}

	}

}
