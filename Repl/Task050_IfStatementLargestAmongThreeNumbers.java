package assignments.repl;

import java.util.Scanner;

public class Task050_IfStatementLargestAmongThreeNumbers {

	public static void main(String[] args) {
//		its like bigger among two numbers where :
//			if(n1 > n2) {System.out.print("n1 is bugger" );			}
//			in this problem you need to write a program that checks for the 
//			bigger of 3 numbers.
//			you get 3 int variables: n1 , n2 and n3
//			if n1 is biggest output: "n1 is bigger"if n2 is biggest output: 
//			"n2 is bigger"if n3 is biggest output: "n3 is bigger"
//
//			for example:
//
//			n1 = 1, n2 = 2, n3  = 1
//			output: "n2 is bigger"
//
//			n1 = 3, n2 = 2, n3  = 1
//			output: "n1 is bigger"
//
//			n1 = 3, n2 = 2, n3  = 30
//			output: "n3 is bigger"
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = s.nextInt();
		System.out.println("Enter the second number: ");
	    int n2 = s.nextInt();
	    System.out.println("Enter the third number: ");
	    int n3 = s.nextInt();
	    s.close();
	    
	    //your code here
		
		 	if(n1>n2 & n1>n3) {
		    	System.out.println("n1 is bigger");
		    }else if(n2>n3 & n2>n1){
		    	System.out.println("n2 is bigger");
		    }else if(n3>n2 & n3>n1){
		    	System.out.println("n3 is bigger");
		    }else {System.out.println("At least two bigger numbers are equal.");
		    	
		    }

	}

}
