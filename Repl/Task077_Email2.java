package a_repl.A061_80;

import java.util.Scanner;

public class Task077_Email2 {

	public static void main(String[] args) {
//		Write a program that will print out information about the user based on email. 
//		Print first and last name from the upper case.
//		Sample Output:
//		     Input: craig_federighi@apple.com
//		     Output:
//		           First name: Craig
//		           Last name: Federighi
//		           Domain: apple
//		           Top-Level Domain: com
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter eMail: ");
		String email = scan.nextLine();
		scan.close();
		
		String firstName = email.substring(0, email.indexOf('_'));
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
		String topLevelDomain = email.substring(email.indexOf('.')+1);
		
		System.out.println("First name: "+ firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topLevelDomain);

	}

}
