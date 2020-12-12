package a_repl.A221_240;
//This assignment is about another calculator class. this time we will calculate two attributes x and y and 
//put the result in an attribute named result.
//
//x, y and results are all private attributes of int type.
//
//3 Instance variables:
//  1) names: x, y, result
//      type: int
//      Visibility/Access modifier: private
// 
//Instance Methods:
//   - getResult() - getter method for private result
//   - setY(int y) - setter method for private y
//   - setX(int x) - setter method for private x
// -  void plus() - adds x and y (x+y) values and assigns to result 
//   - void minus() - subtracts x and y(x-y) values and assigns to result 

public class Task223_OOP_CalcII {
	public static void main(String[] args) {
		   
		  CalcII a = new CalcII();
		  a.setX(10);
		  a.setY(5);
		  a.plus();
		  System.out.println("10+5 = "+ a.getResult());//1+1 = 2
		  a.minus();
		  System.out.println("10-5 = "+ a.getResult());
		  
		  }

}

class CalcII{
	private int x;
	private int y;
	private int result;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void plus() {
		this.result = this.x + this.y;
	}
	
	public void minus() {
		this.result = this.x - this.y;
	}
	
	
	
	
	
	
	
}
