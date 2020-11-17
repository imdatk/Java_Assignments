package a_repl.A101_120;

import java.util.Scanner;

public class Task102_ParseHTML {

	public static void main(String[] args) {
//		Hypertext Markup Language (HTML) is the standard markup language for creating 
//		web pages and web applications. HTML is the language in which most websites are 
//		written. HTML is used to create pages and make them functional.
//		
//		Write a program, that will read html variable and output attribute value of id 
//		attribute (tag) into the console. Input will be provided in a single line as 
//		outlined below. If html variable doesn't contain <html> attribute, print out 
//		into the console message: "Invalid input!". 
//
//		Example: 
//		input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
//		output: myid
		
		 Scanner scan = new Scanner(System.in);
		 String html = scan.nextLine();
		 if(html.contains("<html>")) {
			 
		 String id = html.substring((html.indexOf("\"", html.indexOf("id=")))+1,
				 			html.lastIndexOf("\"", html.length()-1));
		 System.out.println(id);
		 }else {
			 System.out.println("Invalid input!");
		 }
		 
		
	}

}
