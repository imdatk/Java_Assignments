package a_repl.A061_80;

import java.util.Scanner;

public class Task074_Alejandro1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String a = scan.nextLine();
		scan.close();
		
		eMailsToMe(a);

	}

	private static void eMailsToMe(String mail) {
		mail = mail.toLowerCase();
		if(mail.contains("alejandro")) {
			System.out.println("read this mail");
		}else {
			System.out.println("don't read");
		}
		
	}

}
