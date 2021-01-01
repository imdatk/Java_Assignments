package assignments.assignment14_OOP;

public class Question05_TV {
	int channel=1;
	int volumeLevel=1;
	boolean on = false;
	String brand = "undefined";
	
	public Question05_TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public Question05_TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel<=120 && channel>0) {
			this.channel = channel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if(volumeLevel<=7 && volumeLevel>=1) {
			this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		if(channel<120) {
			channel++;
		}
	}
	
	public void channelDown() {
		if(channel>1) {
			channel--;
		}
	}
	
	public void VolumeUp() {
		if(volumeLevel<7) {
			volumeLevel++;
		}
	}
	
	public void VolumeDown() {
		if(volumeLevel>1) {
			volumeLevel--;
		}
	}
	
	public void isOn() {
		if(on) {
			System.out.println("TV is already ON");
		}
		
	}
	
	public void turnOn() {
		if(!on) {
			on = true;
		}else {
			System.out.println("TV is already ON");
		}
	}
	
	public void turnOff() {
		if(!on){
			System.out.println("TV is already OFF");
		}else {
			on = false;
		}
	}
	
	

}
