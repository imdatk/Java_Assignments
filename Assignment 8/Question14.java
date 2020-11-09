package Assignment8;

public class Question14 {

	public static void main(String[] args) {
//		This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
//		It returns true only if both a and b are true or c is true.

		System.out.println(threeLocks(true, true, true));
	}

	private static boolean threeLocks(boolean a, boolean b, boolean c) {
		if(a==true && b == true || a == true && c == true || b==true && c == true) {
			return true;
		}else {
			return false;
		}
		
	}

}
