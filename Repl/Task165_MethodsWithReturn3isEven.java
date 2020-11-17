package a_repl.A161_180;

public class Task165_MethodsWithReturn3isEven {

	public static void main(String[] args) {
//		isEven method gets a number(int) if its even (2,4,8...) returns true.
//		if its odd return false.
//
//		for example:
//
//		isEven(1) --> false
//
//		isEven(8) --> true
		
		System.out.println(isEven(1));

	}
	public static boolean isEven(int n){
		if(n%2 == 0) {
			return true;
		}else {
			return false;
		}
	 
	}

}
