package Assignment6;

public class Question3_DecreasingNumbers {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1 2 3 4 5 6 7
//		 2 3 4 5 6 7
//		  3 4 5 6 7
//		   4 5 6 7
//		    5 6 7
//		     6 7
//		      7
//		     6 7
//		    5 6 7
//		   4 5 6 7
//		  3 4 5 6 7
//		 2 3 4 5 6 7
//		1 2 3 4 5 6 7
		
		int x = 1;
		int y = 6;
		for(int i=1; i<=7 ;i++) {	
			for(int j=1; j<i; j++){ System.out.print("  ");}     
			for(int k=x; k<=7; k++) { System.out.print(k + "   ");} 
			System.out.println();  
			x++;  
		}
		for(int i=6; i>=1 ;i--) {	
			for(int j=1; j<i; j++){ System.out.print("  ");}     
			for(int k=y; k<=7; k++) { System.out.print(k + "   ");} 
			System.out.println();  
			y--;
		}


	}

}
