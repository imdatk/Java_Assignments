package assignments.repl;

import java.util.*;

public class Task025_GreaterNumber {

	public static void main(String[] args) {
//		using an if statement check which int is larger a or b, and then output:
//			"number is greater".
//
//			for example:
//			a=1
//			b=2
//
//			output: 
//			2 is greater
//
//			a=5
//			b=7
//
//			output:
//			7 is greater 
		
		
		
		Scanner s = new Scanner(System.in);
		    int a = s.nextInt();
		    int b = s.nextInt();
		    
		    //WRITE YOUR CODE HERE:
		   if (a >= b){
		     System.out.println(a + " is greater");
		   }else{
		     System.out.println(b + " is greater");
		   }

	}

}
