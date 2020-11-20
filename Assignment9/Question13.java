package Assignment9;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
//		Write a program that will print out route instructions. Your program should take 2 parameters: start point and endpoint.
//		Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to endpoint - display:
//			"start/end(start or end variable!) found".
//		Note: you may move only clockwise.
//
//		Sample Output:
//		     Input: A
//		     Input: D
//		     Output: right > down > left: D found
//
//		     Input: C
//		     Input: C
//		     Output: C found
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter starting point: ");
		String start = scan.next();
		System.out.println("Enter ending point: ");
	    String end = scan.next();
	    
	    char start1 = start.charAt(0);    // start1'e string'in ilk karakterini atiyoruz.
	    char end1 = end.charAt(0);
			
	    if (start1 == end1) {
	    	System.out.println(start1 + " found");	
	    }else {if (end1>start1) {
	    			for (; start1<end1; start1++) {
	    				if (start1 == 'A') {
	    					direction1();
	    					if(end1 =='B') {
	    						break;
	    					}
	    					System.out.print(" > ");
	    				}else if (start1 == 'B'){;
	    					direction2();
	    					if(end1 =='C') {
	    						break;
	    					}
	    					System.out.print(" > ");
	    				}else if (start1 == 'C') {
	    					direction3();
	    					if(end1 =='D') {
	    						break;
	    					}
	    					System.out.print(" > ");
	    				}
	    			}
	    			System.out.println(": " + end1 + " found");	    
	    		}else if(start1>end1) {
	    			for(;start1>end1; start1++) {
	    				if (start1 == 'B') {
	    					direction2();
	    					System.out.print(" > ");
	    				}else if (start1 == 'C'){;
    						direction3();
    						System.out.print(" > ");
	    				}else if (start1 == 'D') {
	    					direction4();
	    					if(end1 == 'A') {
	    						break;}
	    					System.out.print(" > ");
	    				}else if (start1 == 'E') {
	    					direction1();
	    					if(end1 == 'B') {
	    						break;}
	    					System.out.print(" > ");
	    				}else if(start1 == 'F') {
	    					direction2();
	    					if(end1 == 'B') {
	    						break;}
	    				}
	    		}System.out.println(": " + end1 + " found");
	    
	    		}
	    	}
	   }

		public static void direction1() {
			System.out.print("right");
		}
		public static void direction2() {
			System.out.print("down");
		}
		public static void direction3() {
			System.out.print("left");
		}
		public static void direction4() {
			System.out.print("up");
		}
		

}
