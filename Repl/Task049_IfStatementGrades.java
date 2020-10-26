package assignments.repl;

import java.util.Scanner;

public class Task049_IfStatementGrades {

	public static void main(String[] args) {
//		In this assignment you will get a grade int and using ifs output if it's a passing grade or failure.
//		
//		if grade is bigger than 90 output "excellent" 
//		if the grade is bigger than 70 and smaller then 90 output "good"
//		if grade is bigger than 60 and smaller than 70 output "pass"
//		if grade is smaller than 60 output "fail"
//		
//		hint: && is the operator for and in java.

		Scanner s = new Scanner(System.in);
	    int grade = s.nextInt();
	    s.close();
	    //your code here
	    if(grade >=90 && grade <=100) {System.out.println("excellent");
	    	
	    }else if(grade >=70 && grade <90) {System.out.println("good");
	    	
	    }else if(grade >=60 && grade <70) {System.out.println("pass");
	    	
	    }else if(grade < 60 && grade >= 0) {System.out.println("fail");
	    	
	    }else {System.out.println("Invalid Grade!");
	    }
	}

}
