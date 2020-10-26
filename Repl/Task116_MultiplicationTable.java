package assignments.repl;

import java.util.Scanner;

public class Task116_MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number between 1-12");
	    
	    int num = scan.nextInt(); //TODO CALL SCANNER METHOD HERE
	    for (int i=1; i<=10; i++){
	      System.out.println(num + " X " + i + " = " + (num * i));
	    }

	}

}
