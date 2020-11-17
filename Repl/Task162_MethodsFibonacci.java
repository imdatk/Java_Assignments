package a_repl.A161_180;

import java.util.Scanner;

public class Task162_MethodsFibonacci {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib1(num);
		    System.out.println();
		    fib(num);
		  }
		  
		  public static void fib1(int num){
		    //WRITE YOUR CODE HERE
		    int previous = 0;
		    int current = 1;
		    System.out.print(previous + ", " + current+", " );
		    for(int i=3; i<=num; i++){
		      int next = previous + current;
		      System.out.print(next);
		      if(i==num) {
		    	  break;
		      }
		      System.out.print(", ");
		      previous = current;
		      current = next;
		    }
		  }
	 
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
	    int previous = 0;
	    int current = 1;
	    int next =1;
	    if(num==0) {
	    	next = 0;
	    }
	    
	    for(int i=3; i<=num; i++){
	      next = previous + current;
	      previous = current;
	      current = next;
	    }System.out.println(next);
	    
	  }
	 
	 

}
