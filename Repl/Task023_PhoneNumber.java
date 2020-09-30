package assignments.repl;

import java.util.*;

public class Task023_PhoneNumber {

	public static void main(String[] args) {
		 
//		Write a program that asks the user to input int values: areaCode and localNumber.
//
//		-Using concatenation put together in this format and assign to String phoneNumber  variable:
//
//		For example : 
//		If the areaCode is 222 and localNumber is 3334444 then the phoneNumber value will be (222)-3334444
//
//		-Write a print statement to display below output (use phoneNumber variable ): 
//		Calling number (222)-3334444
		
				
		Scanner scan = new Scanner(System.in);
		    //YOUR CODE HERE 
		    int areaCode, localNumber;
		    String phoneNumber;
		    areaCode = scan.nextInt();
		    localNumber = scan.nextInt();
		    phoneNumber = "(" + areaCode + ")" + "-" + localNumber;
		    System.out.println("Calling number " + phoneNumber);

	}

}
