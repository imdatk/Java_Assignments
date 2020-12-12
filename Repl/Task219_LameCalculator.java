package a_repl.A201_220;
//The LameCalculator class has instance methods that can do simple math operations on two numbers. 
//the methods are: plus, minus, multiply and divide.
//all the methods get two ints then the method does the required math operation and returns the result as an int.
//
//for example:
//
//	LameCalculator lc = new LameCalculator();
//	
//	lc.plus(1,1)
//	returns:2
//	
//	lc.minus(1,1)
//	returns:0
//	
//	lc.multiply(2,1)
//	returns:2
//	
//	lc.divide(10,2)
//	returns:5

public class Task219_LameCalculator {
	public static void main(String[] args) {
		   
		  LameCalculator lc = new LameCalculator();
		  System.out.println("1+1 = "+lc.plus(1,1)); 
		  System.out.println("2-3 = "+lc.minus(2,3));
		  System.out.println("2x3 = "+lc.multiply(2,3));
		  System.out.println("10:2 = "+lc.divide(10,2));
		  
	}
}

class LameCalculator{
	private int num1;
	private int num2;
	
	public int plus(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return this.num1 + this.num2;
		
	}
	
	public int minus(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return Math.abs(this.num1 - this.num2);
		
	}
	
	public int multiply(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return this.num1 * this.num2;
		
	}
	
	public int divide(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return this.num1 / this.num2;
		
	}
}

