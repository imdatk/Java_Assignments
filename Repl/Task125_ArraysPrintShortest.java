package a_repl.A121_140;

import java.util.Scanner;

public class Task125_ArraysPrintShortest {

	public static void main(String[] args) {
//		Write a program that will print the shortest word in the given array str. 
//
//		input: java, cable, red, vivid, remedy, grace
//		output: red
		
		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    
	    String min = str[0];
	    for(String x: str) {
	    	if(x.length()<min.length()) {
	    		min = x;
	    	}
	    }
	    System.out.println(min);
	}

}
