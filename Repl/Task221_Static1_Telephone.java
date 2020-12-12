package a_repl.A221_240;

public class Task221_Static1_Telephone {
	public static void main(String[] args) {
			
			Telephone t = new Telephone();
			t.quantity = 300;
			t.total = 1650;
			t.setNumber();
			System.out.println(t.getNumber());
			
		}
}

class Telephone{
	
	String number;
	static int quantity = 250;
	static double total = 15658.92;
	
	public String getNumber() {
		return number;
	}
	public void setNumber() {
		this.number = Double.toString(quantity*total);
	}
	
	
	
}
