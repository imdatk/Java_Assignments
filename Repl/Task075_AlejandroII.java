package a_repl.A061_80;

import java.util.Scanner;

public class Task075_AlejandroII {

	public static void main(String[] args) {
//		as Alejandro is time is precious and even with his little knowledge of programming 
//		he managed to save some time. but still he had a lot of emails to read.
//
//		he wants to add more conditions to his program, he wants only job related mails
//		so he will narrow it down by also checking if the word "project" also appears 
//		beside his name, that way he will be sure its a job email that refers to him.
//		 
//
//		for example:
//
//		a = "dear alejandro.....alot of text"
//
//		outputs: "dont read"
//
//		a = "thunder blaz is the best drink in the galaxy..."
//
//		outputs: "dont read"
//
//		a = "subject : important project, alejandro we refer to you  this ...."
//
//		outputs: "read this mail"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String a = scan.nextLine();
		scan.close();
		
		eMailsToMe(a);

	}

	private static void eMailsToMe(String mail) {
		mail = mail.toLowerCase();
		if(mail.contains("alejandro") && mail.contains("project")) {
			System.out.println("read this mail");
		}else {
			System.out.println("don't read");
		}

	}

}
