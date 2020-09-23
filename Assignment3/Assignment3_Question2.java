package assignments.day04;

public class Assignment3_Question2 {

	public static void main(String[] args) {
		/* Write a program - > Declare variables for your name and birth year, and the program will display:
		 * " Hello, Ozzy! Based on your input, your age is 15 :) " */
		String name;
		name= "Kerim";
		int birthYear;
		birthYear = 2001;
		int currentYear = 2020;
		int age = currentYear - birthYear;
		
		System.out.println("Hello " + name + "! Based on your input, your age is " + age + " :)");

	}

}
