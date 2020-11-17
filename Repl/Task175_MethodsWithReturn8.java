package a_repl.A161_180;

import java.util.Scanner;

public class Task175_MethodsWithReturn8 {
//	We have a to do list app, every time a user adds a task - a few things needed to be checked.
//
//	It should not be empty. boolean parameter needs to be true
//	taskId should be only 1 greater than currentID. for example if we have 7 tasks
//	(currentId is 7) so the next task id is 8 , it can't be 10.
//
//	for example:
//
//	validateTask(true,2,1)
//	returns true
//
//	validateTask(true,3,1)
//	returns false
//
//	validateTask(false,3,2)
//	returns false

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean notEmpty = scan.nextBoolean();
		int taskId = scan.nextInt();
		int currentId = scan.nextInt();
		
		System.out.println(validateTask(notEmpty,taskId,currentId));
		
	}
	
	public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
	    boolean sonuc = false;
	    if(!notEmpty) {
			return sonuc;
		}else {
			if(taskId-currentId != 1) {
				return sonuc;
			}else {
				sonuc = true;
				return sonuc;				
			}
		}
	    
	}

}
