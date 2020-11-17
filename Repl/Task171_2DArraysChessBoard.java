package a_repl.A161_180;

import java.util.Arrays;

public class Task171_2DArraysChessBoard {
//	Given a 8x8 two-dimensional array of strings named chessboard. Initialize values inside an array accordingly 
//	to the chess board. So first element in the array, chessboard[0][0] should have a value "1a", and last element
//	in the array, chessboard[7][7] should have a value "8h".
	
	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
		int x =1; 
//		for(String[] kare : chessBoard) {
//			char y = 'a';
//			for(String kareDeger : kare) {
//				kareDeger = x + "" + y;
//				y++;
//			}
//		}
		for(int i=0; i<chessBoard.length;i++) {
			char y = 'a';
			for(int j=0; j<chessBoard[i].length;j++) {
				chessBoard[i][j] = 1 + i + "" + y;
				y++;
			}
		}
	    
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));	

	}

}
