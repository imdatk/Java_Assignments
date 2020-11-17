package a_repl.A081_100;

import java.util.Scanner;

public class Task092_Factorial {

	public static void main(String[] args) {
//		In mathematics, the factorial of a positive integer n, denoted by n!, 
//		is the product of all positive integers less than or equal to n.  
//		Calculate factorial and output result to the console. 
//		Example:
//		input: 5
//		output: 120
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long factorial = 1;
		for (int i=1; i<=n; i++) {
		 factorial = factorial * i;
		}
		System.out.println(factorial);
		
//		int i,fact=1;  
//		  int number=10;//It is the number to calculate factorial    
//		  fact = factorial(number);   
//		  System.out.println("Factorial of "+number+" is: "+fact);   
//		  
//		  int result = sum(5);
//		  System.out.println(result);

	}
//	
//	 static int factorial(int n){   // recusion: islemi n'e kadar yapiyor. 
//		  if (n == 0)    
//		    return 1;    
//		  else    
//		    return(n * factorial(n-1));    
//		 }    
//	 
//	 public static int sum(int k) { // recusion: islemi k'ya kadar yapiyor. 
//		    if (k > 0) {
//		      return k + sum(k - 1);
//		    } else {
//		      return 0;
//		    }

}
