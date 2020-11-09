package Assignment8;

public class Question15 {

	public static void main(String[] args) {
//		We have a to do list app, every time a user adds a task - a few things needed to be checked.
//		It should not be empty. boolean parameter needs to be true
//		taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7)
//		so the next task id is 8 , it can't be 10.
//
//		for example:
//		validateTask(true,2,1)
//		returns true
//		validateTask(true,3,1)
//		returns false
//		validateTask(false,3,2)
//		returns false
		
		System.out.println(validateTask(true,8,6));

	}

	private static boolean validateTask(boolean b, int taskID, int currentID) {
		boolean result = false;
		if(b== true && taskID == currentID +1) {
				result =  true;
			}else if(b== false) {
				result = false;
			}
		return result;
		
	}

}
