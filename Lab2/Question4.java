package assignments.Lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
//		Write a program that asks user for the number of males and the number 
//		of females registered in a class. The program should display the percentage
//		of males and females in the class.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of males: ");
		int noM = scan.nextInt();
		System.out.println("Enter number of females: ");
		int noF = scan.nextInt();
		
		double poM = ((double)noM/(double)(noM + noF))*100;
		double poF = ((double)noF/(double)(noM + noF))*100;
		System.out.println("Percentage of females = "+ poF + "%");
		System.out.println("Percentage of males = "+ poM + "%");
	}

}
