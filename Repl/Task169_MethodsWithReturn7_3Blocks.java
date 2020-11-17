package a_repl.A161_180;

public class Task169_MethodsWithReturn7_3Blocks {

	public static void main(String[] args) {
//		This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
//
//		It returns true only if both a and b are true or c is true.
//
//		https://en.wikipedia.org/wiki/Truth_table
		
		System.out.println(threeLocks(false,true, false));

	}
	 public static boolean threeLocks(boolean a, boolean b, boolean c) {
		    boolean lock = false;
		    if((a==true && b==true) || (a==true && c==true) || (b==true && c==true))  {
		    	lock = true;
		    }else {
		    	lock = false;
		    }
		    return lock;

		    
		    
	  }//end threeLocks

}
