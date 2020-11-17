package a_repl.A081_100;

import java.util.Scanner;

public class Task086_Party {

	public static void main(String[] args) {
//		Imagine you have a party and need to form the list of the guests. 
//		(Assume you have at least one guest)
//		Ask for the first guest name.
//		Then ask does user want to enter one more guest.
//		If yes - take input from.
//		If not - finish the program and print list of the guests.
//
//		Example of the program:
//
//		Please enter guest name:
//		Nick
//		Do you want to enter new guest name:
//		yes
//		Please enter guest name:
//		Linda
//		Do you want to enter new guest name:
//		no
//
//		Guest's list: Nick, Linda
				 
	    Scanner input = new Scanner(System.in);
	    
	    // your code 
	    // -------
	    String guest = "";
	    String newGuest = "";
	    String guestsList = "";
	    int guestCount = 1;
	    
	    do {
	    	System.out.println("Please enter guest name:");
	    	guest=  input.next();
	    	if(guestCount >1) {
	    		guestsList = guestsList + ", " + guest;
	    	}else {
	    		guestsList = guest;
	    	}
	    	guestCount++;
	    	System.out.println("Do you want to enter new guest name:");
	    	newGuest = input.next();
	    	
	    }while(newGuest.equalsIgnoreCase("Yes"));
	   
	    System.out.println("Guest's list: " + guestsList);

	}

}
