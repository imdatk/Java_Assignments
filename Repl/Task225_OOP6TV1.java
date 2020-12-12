package a_repl.A221_240;

//Write a custom class TV that has 4 instance variables: 
//int channel=1;
//int volumeLevel=1;
//boolean on = false; 
//String brand = "undefined" ;
//             
//Create one no arguments constructor that prints the message: "Creating TV object using no Args- constructor". 
//
//Create one more constructor that sets the value for instance variable brand, and displays the message:"Creating TV object using 1 arg - constructor".
//
//Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
//
//Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
//
//Create isOn() method that will check tv status. (getter for on instance variable)
//     It should return the value of on instance variable as is.
//
//Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.
//
//Create isOn(), turnOn() and turnOff() methods for "on" instance variable. 
//If the tv is already on, 
//     no need to turn it on again, display the message: "TV is already ON". 
//If the tv is already off, 
//   then no need to turn it off again, display the message: "TV is already OFF". 
//
//The value of a variable channel cannot be negative or zero, and cannot be higher than 120. If the user will try to set an invalid channel, 
//display the message: "ERROR: TV is either OFF or invalid Channel".
//
//Volume can be only in the range between 1 and 7. 
//You may change volume only if TV is on. 
//If it was off, display a message: "ERROR: TV is either OFF or invalid Volume level".

public class Task225_OOP6TV1 {

	public static void main(String[] args) {
		TV deneme = new TV();
		TV deneme2 = new TV("Toshiba");
		
		System.out.println(deneme.getChannel());
		deneme.setChannel(125);
		System.out.println(deneme.getChannel());
		deneme.setChannel(118);
		System.out.println(deneme.getChannel());
		deneme.setVolumeLevel(12);
		System.out.println(deneme.getVolumeLevel());
		deneme.setVolumeLevel(6);
		System.out.println(deneme.getVolumeLevel());
		deneme.turnOff();
		deneme.turnOn();
		deneme.setVolumeLevel(6);
		System.out.println(deneme.getVolumeLevel());
		deneme.volumeUp();
		System.out.println(deneme.getVolumeLevel());
		deneme.volumeUp();
		System.out.println(deneme.getVolumeLevel());
		deneme.setVolumeLevel(2);
		System.out.println(deneme.getVolumeLevel());
		deneme.volumeDown();
		System.out.println(deneme.getVolumeLevel());
		deneme.volumeDown();
		System.out.println(deneme.getVolumeLevel());
		deneme.channelUp();
		System.out.println(deneme.getChannel());
		deneme.channelUp();
		System.out.println(deneme.getChannel());
		deneme.channelUp();
		System.out.println(deneme.getChannel());
		deneme.setChannel(2);
		System.out.println(deneme.getChannel());
		deneme.channelDown();
		System.out.println(deneme.getChannel());
		deneme.channelDown();
		System.out.println(deneme.getChannel());
		System.out.println(deneme.isOn());
		deneme.turnOff();
		System.out.println(deneme.isOn());
		deneme.setVolumeLevel(70);
		System.out.println(deneme.getVolumeLevel());

	}

}

class TV{
	int channel=1;
	int volumeLevel=1;
	boolean on = false; 
	String brand = "undefined" ;
	
	public TV(){
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel<=0 || channel>120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
			this.channel = channel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if(on && (volumeLevel>=1 && volumeLevel<8)) {
			this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		if(channel<120)
		this.channel++;
	}
	
	public void channelDown() {
		if(channel>1)
		this.channel--;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void turnOn() {
		if(isOn()) {
			System.out.println("TV is already ON");
		}else {
			this.on = true;
		}
	}
	
	public void turnOff() {
		if(!isOn()) {
			System.out.println("TV is already OFF");
		}else {
			this.on = false;
		}
	}
	
	public void volumeUp() {
		if(volumeLevel<7) {
			this.volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if(volumeLevel>1) {
			this.volumeLevel--;
		}
	}
	
	
	
	
	
}