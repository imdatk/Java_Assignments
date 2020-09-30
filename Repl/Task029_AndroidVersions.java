package assignments.repl;

import java.util.*;

public class Task029_AndroidVersions {

	public static void main(String[] args) {
//		Android is one of the best operating systems in the world that helps 
//		the billion of users who use smart phones and tablets. Also, Android 
//		versions always had some funny names related to sweets. 
//		In this assignment, you need to write a program that will print a name of Android version,
//		based on number. Please refer to the table beneath, in order to develop your if statement.
		Scanner scan = new Scanner(System.in);
		double versionNumber = scan.nextDouble();
		
		if (versionNumber==1.5) {System.out.println("Cupcake");}
		else if (versionNumber==1.6) {System.out.println("Donut");}
		else if (versionNumber==2.1) {System.out.println("Eclair");}
		else if (versionNumber==2.2) {System.out.println("Froyo");}
		else if (versionNumber==2.3) {System.out.println("Gingerbread");}
		else if (versionNumber==3.1) {System.out.println("Honeycomb");}
		else if (versionNumber==4.0) {System.out.println("Ice Cream Sandwich");}
		else if (versionNumber>=4.1 && versionNumber<=4.31) {System.out.println("Jelly Bean");}
		else if (versionNumber>=4.4 && versionNumber<=4.44) {System.out.println("KitKat");}
		else if (versionNumber>=5.0 && versionNumber<=5.11) {System.out.println("Lollipop");}
		else if (versionNumber>=8.0 && versionNumber<=8.1) {System.out.println("Oreo");}
		else if (versionNumber==9.0) {System.out.println("Pie");}
		else {System.out.println("Sorry, I don't know this version!");}
	}

}
