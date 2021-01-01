package assignments.assignment14_OOP;

public class Question06_ParkingMeter {
	
	int timeLeft=0;
	int maxTime;
	
	public Question06_ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	
	public boolean add(int value) {
		if(value==25) {
			timeLeft+=30;
			if(timeLeft>=maxTime) {
				timeLeft-=30;
				return false;
			}
			return true;
		}
		return false;
	}
	
	public void tick() {
		if(timeLeft>0) {
			timeLeft--;
		}
	}
	
	public boolean isExpired() {
		if(timeLeft==0) {
			return true;
		}
		return false;
	}
	
	
	
	

}
