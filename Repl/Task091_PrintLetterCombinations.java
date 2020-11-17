package a_repl.A081_100;

public class Task091_PrintLetterCombinations {

	public static void main(String[] args) {
//		Write a loop that displays all possible combinations of two letters where the
//		letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be 
//		displayed in descending alphabetical order:
//
//			zz
//			zy
//			zx
//			zw
//			zv
//			yz
//			....
//			vv
		char letter = 'z';	
		for (char i = 'z'; i>='v'; i--) {
			for(char y = 'z'; y>='v'; y--) {
				System.out.println(i+""+ y);				
			}
		}

	}

}
