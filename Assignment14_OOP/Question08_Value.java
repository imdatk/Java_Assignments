package assignments.assignment14_OOP;

public class Question08_Value {
	
	public static void main(String[] args) {
		
		// setValue is not called and one argument constructor is not invoked
		Value val1 = new Value();
		System.out.println(val1.getVal());					// 0
		
		//setValue is called
		Value val2 = new Value(50);
		val2.setVal(45);
		System.out.println(val2.getVal());					// 45
		
		//One argument constructor is invoked, setVal is not called
		Value val3 = new Value(50);
		System.out.println(val3.getVal());					// 50
	}
}

class Value{
	int x = Integer.MIN_VALUE;
	int y = Integer.MIN_VALUE;
	
	public Value() {
		
	}
	
	public Value(int x) {
		this.x = x;
	}
	
	public void setVal(int x) {
		y = this.x;
		this.x = x;
	}
	
	public boolean wasModified() {
		if(this.y!= Integer.MIN_VALUE) {
			return true;
		}
		return false;
		
	}
	
	public int getVal() {
		if(wasModified()) {
			return this.x;
		}else if(wasModified()==false && x != Integer.MIN_VALUE) {	
			return this.x;
		}else {
			return 0;
		}
	}
	
	
}
