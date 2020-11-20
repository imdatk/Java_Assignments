package Assignment9;

import java.util.Scanner;

public class Question02_LaptopPrice {
	public static void main(String[] args) {
//		
		Scanner scan = new Scanner(System.in);
				
//		Write a program that will calculate laptop price based on the components.
				
//		First, ask user for screen size:
		System.out.println("Select screen size: ");
		double screenSize = scan.nextDouble();
			
//		Then ask the user for CPU type:
		System.out.println("Select CPU type: ");
		String cpuType = scan.next();
//		
//		Then ask the user for RAM size:
		System.out.println("Select RAM size: ");
		int RAM = scan.nextInt();
//		
//		Then, ask the user for the storage type. 
		System.out.println("Select storage type: ");
		String storageType = scan.next();
		System.out.println("Enter memory size: ");
		int memorySize = scan.nextInt();
//		
//		Then ask the user for screen resolution.
		System.out.println("Enter screen resolution: ");
		String screenResolution = scan.next();
		scan.close();
//			
//		Sample Output:
//		Display message: Select screen size:
//		input: 13.3
//		Display message: Select CPU type:
//		input: i7
//		Display message: Select RAM size:
//		input: 8
//		Display message: Select storage type:
//		input: SSD
//		Display message: Enter memory size:
//		input: 1000
//		Display message: Enter screen resolution:
//		input: 4K
//		Display message: Laptop price is: $1050.0
//		
//		Example #2
//		Display message: Select screen size:
//		input: 13.3
//		Display message: Select CPU type:
//		input: i3
//		Display message: Select RAM size:
//		input: 4
//		Display message: Select storage type:
//		input: HDD
//		Display message: Enter memory size:
//		input: 500
//		Display message: Enter screen resolution:
//		input: FULLHD
//		Display message: Laptop price is: $550.0
		double price = laptopPrice(screenSize, cpuType, RAM, storageType, memorySize, screenResolution);
		System.out.println("Laptop price is: " + price + "$");
	}

	private static double laptopPrice(double screenSize, String cpuType, int RAM, 
			                     String storageType, int memorySize, String screenResolution) {
		double price = 0;
//		If screen size equals to 13.3, add $200 to the laptop price.
//		If screen size equals to 15.0 - add $300 to the laptop price. 
//		If screen size equals to 17.3 - add $400 to the laptop price.
		if(screenSize == 13.3) {
			price = price + 200;
		}else if(screenSize == 15.0){
			price = price + 300;
		}else if(screenSize == 17.3){
			price = price + 400;
		}else {
			System.out.println("Incvalid Entry!");
		}
//		If CPU type equals to i3, add $150 to the laptop price.
//		If CPU type equals to i5, add $250 to the laptop price. 
//		If CPU type equals to i7, add $350 to the laptop price.
		if(cpuType.equalsIgnoreCase("i3")) {
			price = price + 150;
		}else if(cpuType.equalsIgnoreCase("i5")){
			price = price + 250;
		}else if(cpuType.equalsIgnoreCase("i7")){
			price = price + 350;
		}else {
			System.out.println("Incvalid Entry!");			
		}
//		Add $50 for every 4GB of ram to the laptop price.
		for (int r=4; r<=RAM; r+=4) {
			price = price+50;
		}
//		If it's HDD - add $50 to the laptop price for every 500gb.
//		If it's SSD - add $100 to the laptop price for every 500GB.
		if(storageType.equalsIgnoreCase("HDD")) {
			for(int h=500; h<=memorySize; h+=500 ) {
				price = price + 50;
			}			
		}else if(storageType.equalsIgnoreCase("SSD")){
			for(int h=500; h<=memorySize; h+=500 ) {
				price = price + 100;
			}
		}else {
			System.out.println("Incvalid Entry!");			
		}
//		Add $100 if it's FULLHD screen and $200 if it's 4K screen.
		if(screenResolution.equalsIgnoreCase("fullHD")) {
			price = price + 100;
		}else if(screenResolution.equalsIgnoreCase("4K")){
			price = price + 200;
		}else {
			System.out.println("Incvalid Entry!");			
		}
		return price;
	}

}
