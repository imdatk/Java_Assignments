package assignments.assignment14_OOP;

public class Question03_DB {
	
	private String name;
	private int yint;
	
	
	public void insertData(String name, int yint) {
		this.name = name;
		this.yint = yint;
	}
		
	public String getData() {
		return name;
	}
	public void setData(String name) {
		this.name = name;
	}
	public int getYint() {
		return yint;
	}
	public void setYint(int yint) {
		this.yint = yint;
	}
	
	

}
