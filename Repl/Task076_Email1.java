package a_repl.A061_80;

import java.util.Scanner;

public class Task076_Email1 {

	public static void main(String[] args) {
		
//		In this task, you need to swap first name with last name in the email. 
//		If email doesn't contains underscore - do not anything. 
//
//		Example:
//		input: mike_tyson@gmail.com
//		output: tyson_mike@gmail.com
//
//		Example:
//		input: barakobama@gmail.com
//		output: barakobama@gmail.com
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter eMail: ");
		String eMail = scan.nextLine();
		scan.close();
		
		if(!eMail.contains("_")) {  
			System.out.println(eMail);
		}else {
			eMail = eMail.substring(eMail.indexOf('_')+1, eMail.indexOf('@'))+"_"+
					eMail.substring(0, eMail.indexOf('_'))+
					eMail.substring(eMail.indexOf('@'));
			System.out.println(eMail);
			
		}

	}

}
