package assignments.assignment14_OOP;

public class Question10_Calculator {
	public static void main(String[] args) {
		System.out.println(calc.plus(5,3));
		System.out.println(calc.minus(5,3));
	}
}

class calc{
	public static int plus(int x, int y) {
		return x+y;
	}
	
	public static int minus (int x, int y) {
		return x-y;
	}
	
}
