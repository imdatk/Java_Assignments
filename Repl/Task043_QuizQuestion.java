package assignments.repl;

import java.util.Scanner;

public class Task043_QuizQuestion {

	public static void main(String[] args) {
//		Automated tests are the future.
//		in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.
//		after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.
//		what is the farthest planet in the solar system:
//			a)venus
//			b)pluto
//			c)neptune
//			a
//			a is wrong
				
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String a = s.nextLine();
	    
	    //your code here
	    if (a.equals("a")) {System.out.println(a + " is wrong");}
	    else if (a.equals("b")) {System.out.println(a + " is correct");}
	    else if (a.equals("c")) {System.out.println(a + " is wrong");}
	    else {System.out.println(a + " is not a valid answer");}

	}

}
