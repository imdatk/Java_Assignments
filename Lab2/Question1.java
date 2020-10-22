package assignments.Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
//		Write a program with a loop that lets the user enter a series of integer numbers. 
//		After all the numbers have been entered, the program should display the largest and smallest numbers entered.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		int n1 = scan.nextInt();
		System.out.println("Enter your next number: ");
		int n2 = scan.nextInt();
		int lN =0, sN=0, choice;
		
		if(n1>n2) {lN = n1; sN = n2;
		}else if(n2>n1) { lN = n2; sN = n1;}
		
		System.out.println("Do you want to enter another number: 0-No, 1-Yes: ");
		choice = scan.nextInt();
		
		while(choice == 1) {
			System.out.println("Enter your next number: ");
			int nN = scan.nextInt();
			
			if(nN>lN) {lN = nN;				
			}else if(nN<sN) {sN = nN;}
			System.out.println("Do you want to enter another number: 0-No, 1-Yes: ");
			choice = scan.nextInt();
		}
		
		System.out.println("Smallest number is: " + sN );
		System.out.println("Largest number is: " + lN );
		
	}

}
