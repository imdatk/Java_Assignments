package assignments.repl;

import java.util.*;

public class Task045_VehicleRecall {

	public static void main(String[] args) {
//		SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. 
//
//		In this assignment you will write a program that will find vehicle for recall. 
//		-Create a scanner object
//		-Create int variable named vehicleYear
//
//		-Display prompt: "Enter vehicle's year:"
//		input: 1996
//
//		 if the value of modelYear does fall within the four recall ranges, display output:
//		"Your vehicle needs to be recalled!"
//
//		Otherwise, display message:
//		"Your vehicle is fine, enjoy!"
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter vehicle's year:");
		int vehicleYear = scan.nextInt();
		if ((vehicleYear>1994 && vehicleYear<1999)||(vehicleYear>2000 && vehicleYear<2003)||
			(vehicleYear>2003 && vehicleYear<2007)||(vehicleYear>2014 && vehicleYear<2018))
			{System.out.println("Your vehicle needs to be recalled!");}
		else {System.out.println("Your vehicle is fine, enjoy!");}

	}

}
