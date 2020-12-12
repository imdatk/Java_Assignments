package a_repl.A221_240;

public class Calculator {
	
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
