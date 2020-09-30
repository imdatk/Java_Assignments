package assignments.repl;

import java.util.*;

public class Task020_Time {

	public static void main(String[] args) {
		
//		In this assignment, you will write code to put together time of day.
//
//		1. Declare variables: hour, minute, second that can hold int values.
//		    Declare amOrPm variable that can hold a String ("AM" or "PM")
//		     (Remember, it's only asking to declare the variables.nothing else at this point)
//
//		2. Instructor will set different values to your variables
//
//		3. Using the variables and concatenation, print values in the format mentioned above.
//
//		For example, if the hour is 12, the minute is 24 second is 33 and amOrPm is PM, then you should get below output:
//		12:24:33 PM
		
		//1. WRITE YOUR CODE HERE:
	    int hour, minute, second;
	    String amOrPm;
	    
	    
	    
	    //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES 
	    Scanner sc = new Scanner(System.in);
	    hour   = sc.nextInt();
	    minute = sc.nextInt();
	    second = sc.nextInt();
	    amOrPm = sc.next();
	    //#############################
	    
	     //2. WRITE YOUR CODE HERE:
	     System.out.println(hour +":"+minute+":"+second+" "+amOrPm);

	}

}
