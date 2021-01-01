package assignments.assignment14_OOP;

public class Question07_GasTank {
	
	double amount=0;
	double capacity;
	
	public Question07_GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas(double amount) {
		this.amount+= amount;
		if(this.amount>this.capacity) {
			this.amount = this.capacity;
		}
	}
	
	public void useGas(double amount) {
		this.amount-= amount;
		if(this.amount<0) {
			this.amount = 0;
		}
	}
	
	public boolean isEmpty() {
		if(this.amount<0.1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(this.amount> this.capacity - 0.1) {
			return true;
		}
		return false;
	}
	
	public double getGasLevel() {
		return this.amount;
	}
	
	public double fillUp() {
		double required = this.capacity - this.amount;
		this.amount = this.capacity;
		return required;
	}
	

}
