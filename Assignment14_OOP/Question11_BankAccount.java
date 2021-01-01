package assignments.assignment14_OOP;

public class Question11_BankAccount {
	
public static void main(String[] args) {
		
		
		Savings newAcc = new Savings(0.5);
		
		System.out.println("Interest Rate is: " + newAcc.interestRate);
		System.out.println("Interest Rate is: " + Savings.interestRate);
		
	}

}

class BankAccount{
	
}

class Savings extends BankAccount{
	
	static double interestRate;
	
	public Savings(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return this.interestRate;
	}
	
}