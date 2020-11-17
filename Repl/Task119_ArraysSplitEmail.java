package a_repl.A101_120;

import java.util.Scanner;

public class Task119_ArraysSplitEmail {

	public static void main(String[] args) {
//		Given a String variable email, write code using split method to print email id and 
//		domain in separate lines.
//
//		Example:
//		email -> info@cybertekschool.com
//		Print:  
//		Email id: info
//		Email domain: cybertekschool.com
//
//
//		If email contains no @ character or multiple @ characters then print invalid email:
//		email -> hello-gmail.com
//		print:  
//		invalid email
//
//		email -> my@fancy@email.com
//		print:  
//		invalid email
		
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    int counter = 0;
	    for(int i=0; i<email.length();i++) {
	    	if(email.charAt(i)=='@') {
	    		counter++;
	    	}
	    }
	    if(!email.contains("@") || counter>1) {
	    	System.out.println("invalid email");
	    }else {
	    	String[] arrEmail = email.split("@");
		    System.out.println("Email id: " + arrEmail[0]);
		    System.out.println("Email domain: " + arrEmail[1]);	    	
	    }
	    
	}

}
