package assignments.repl;

import java.util.Scanner;

public class Task155_Method10_PrintNextThreeNumbers {
	public static void main(String[] args) {

	Scanner inp = new Scanner(System.in);
	System.out.print("enter number");
    int num = inp.nextInt();
    String result = next3(num);
    System.out.println(result);
    
 
 }
 public static String next3(int n) {
	 String result;
	 return result = (n+1) + " " + (n+2)+ " " + (n+3);

}
}
