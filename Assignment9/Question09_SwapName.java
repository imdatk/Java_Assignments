package Assignment9;

import java.util.Scanner;

public class Question09_SwapName {

	public static void main(String[] args) {
//		In this task, you need to swap the first name with the last name in the email. 
//		If the email doesn't contain underscore - do not anything.
//		Sample Output:
//		     input: mike_tyson@gmail.com
//		     output: tyson_mike@gmail.com
//		     input: barakobama@gmail.com
//		     output: barakobama@gmail.com

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter eMail: ");
		String eMail = scan.nextLine();
		scan.close();
		
		if(eMail.contains("_")) {
			eMail = eMail.substring(eMail.indexOf('_')+1, eMail.indexOf('@'))+"_"+
					eMail.substring(0, eMail.indexOf('_'))+
					eMail.substring(eMail.indexOf('@'));
			System.out.println(eMail);
			
		}else {
			System.out.println(eMail);
		}

	}

}
