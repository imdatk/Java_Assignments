package assignments.repl;
import java.util.Scanner;
public class Task047_RealEstateCalculator {

	public static void main(String[] args) {
		
//		Write a program that will estimate your property price. 
//		
//		This program should work with 3 house types: Condo, Townhouse and Single Family Home.		
//		Starting price for Condo = 50000,  for Townhouse = 75000, Single Family Home = 95000.
//		Based on number of bedrooms, add to the price of your property 30000 for every bedroom. 
//		Then you need to ask if property has backyard. Add 5000 to the property price if it's true. 
//		Backyard shouldn't be available for Condo, so display message "Backyard is not available for condo!", 
//		(don't increase property price!), in case someone would try to select backyard for condo.  
//		Then ask user for garage presence. If the property has garage, add 20000 to the property price for every spot. 
//		If amount of garage spots exceeds 10 spots (grater then 10), display message: " Pardon,  it's not a public parking!" 
//		and don't increase property price. Then, ask user for metro accessibility. 
//		If metro is closer than 1 mile (inclusive), add to the property price 10000. 
//		If metro is in the radius from 1 mile to 3 miles,  add to the property price 5000.  
//		Then, ask user for highway accessibility. If highway is closer than 1 mile (inclusive), add to the property price 15000.
//		If highway is in the radius from 1 to 5 miles,  add to the property price 8000.  
//		And if highway is in the radius from 5 mile to 20 miles (inclusive),  add to the property price 4000.  
//		Then your program should ask about nearest school rating. 
//		If school's rating is in the range from 10 (inclusive) to 8 points,  add to the property price 45000. 
//		If school's rating is less than 8 points and more or equals to 4 points,  add to the property price 20000. 
//		Otherwise, add 5000 to the property price.  Then, ask user if any of the family members smoking. 
//		If so, reduce property price for 5000. At the end, display message: "Market report has been generated.", and display underneath:
//		"Your estimate market price is: propertyPrice$" 
//
//		Given:
//
//		-int propertyPrice = 0; 
//		-int numberOfBedrooms, garageSpots;
//		-float metroAccessibility, schoolScore, highwayAccessibility;
//		-boolean backyard, smoking, garage;
//
//		Example 1:
//
//		-Display prompt: Enter your property type:
//		Condo 
//		-Display prompt: How many bedrooms do you have?
//		3
//		-Display prompt: "Do you have a backyard?
//		true
//		-Display prompt: Backyard is not available for condo!
//		-Display prompt: Do you have garage?
//		true
//		-Display prompt: "How many spots?
//		2
//		-Display prompt: "How close is metro station?
//		0.5
//		-Display prompt: "How close is highway?
//		1.5
//		-Display prompt: "What's the rating of nearest school?
//		9
//		-Display prompt: "Does any of your family members smoking?
//		true
//		-Display prompt: "Market report has been generated.
//		-Display prompt: "Your estimate market price is: 238000$
//
//		Example 2:
//
//		*****************************************
//		* Welcome to the RealEstate calculator! *
//		*****************************************
//		Enter your property type:
//		Single Family Home
//		How many bedrooms do you have?
//		10
//		Do you have a backyard?
//		true
//		Do you have garage?
//		true
//		How many spots?
//		11
//		Pardon, it's not a public parking!
//		How close is metro station?
//		1
//		How close is highway?
//		1
//		What's the rating of nearest school?
//		1
//		Does any of your family members smoking?
//		false
//		Market report has been generated.
//		Your estimate market price is:  430000$
		
		
		//DO NOT CHANGE
	    	int propertyPrice = 0; 
			int numberOfBedrooms, garageSpots;
			float metroAccessibility, schoolScore, highwayAccessibility;
			boolean backyard, smoking, garage;
			String houseType;
			Scanner scan = new Scanner(System.in);
			System.out.println("*****************************************");
			System.out.println("* Welcome to the RealEstate calculator! *");
			System.out.println("*****************************************");
	    //WRITE YOUR CODE HERE
			System.out.println("Enter your property type:");
			houseType = scan.nextLine();
			if (houseType.equals("Condo") || houseType.equals("condo") ) {
				propertyPrice = 50000;
				
				System.out.println("How many bedrooms do you have?");
				numberOfBedrooms = scan.nextInt();
				propertyPrice= propertyPrice + (numberOfBedrooms * 30000);
				
				System.out.println("Do you have a backyard?");
				backyard = scan.nextBoolean();
				if (backyard){System.out.println("Backyard is not available for condo!");
				}else {System.out.println("Backyard is not available for condo!");}
				
				System.out.println("Do you have garage?");
				garage = scan.nextBoolean();
				if (garage) {System.out.println("How many spots?");
					garageSpots = scan.nextInt();
					if (garageSpots <= 10) { propertyPrice = propertyPrice + garageSpots * 20000;
					}else if (garageSpots > 10){System.out.println("Pardon, it's not a public parking!");}
				}
				
				System.out.println("How close is metro station?");
				metroAccessibility = scan.nextFloat();
				if (metroAccessibility <= 1) {propertyPrice = propertyPrice + 10000;}
				else if (metroAccessibility > 1 && metroAccessibility <= 3) {propertyPrice = propertyPrice + 5000;}
				else {propertyPrice = propertyPrice;}
				
				System.out.println("How close is highway?");
				highwayAccessibility = scan.nextFloat();
				if (highwayAccessibility <= 1) {propertyPrice = propertyPrice + 15000;}
				else if (highwayAccessibility > 1 && highwayAccessibility <= 5) {propertyPrice = propertyPrice + 8000;}
				else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {propertyPrice = propertyPrice + 4000;}
				else {propertyPrice = propertyPrice;}
				
				System.out.println("What's the rating of nearest school?");
				schoolScore = scan.nextFloat();
				if (schoolScore >= 8 && schoolScore <= 10) {propertyPrice = propertyPrice + 45000;}
				else if (schoolScore >= 4 && schoolScore < 8) {propertyPrice = propertyPrice + 20000;}
				else {propertyPrice = propertyPrice + 5000;}
				
				System.out.println("Does any of your family members smoke?");
				smoking = scan.nextBoolean();
				if (smoking) {propertyPrice = propertyPrice - 5000;					
				}else {propertyPrice = propertyPrice;}
				
				System.out.println("Market report has been generated.");
				System.out.println("Your estimate market price is: "+ propertyPrice + "$");				
				
			}else if (houseType.equals("Townhouse") || houseType.equals("townhouse")) {
				propertyPrice = 75000;
				
				System.out.println("How many bedrooms do you have?");
				numberOfBedrooms = scan.nextInt();
				propertyPrice= propertyPrice + (numberOfBedrooms * 30000);
				
				System.out.println("Do you have a backyard?");
				backyard = scan.nextBoolean();
				if (backyard){propertyPrice = propertyPrice + 5000;
				}else {propertyPrice = propertyPrice;}
				
				System.out.println("Do you have garage?");
				garage = scan.nextBoolean();
				if (garage) {System.out.println("How many spots?");
					garageSpots = scan.nextInt();
					if (garageSpots <= 10) { propertyPrice = propertyPrice + garageSpots * 20000;
					}else if (garageSpots > 10){System.out.println("Pardon, it's not a public parking!");}
				}
				
				System.out.println("How close is metro station?");
				metroAccessibility = scan.nextFloat();
				if (metroAccessibility <= 1) {propertyPrice = propertyPrice + 10000;}
				else if (metroAccessibility > 1 && metroAccessibility <= 3) {propertyPrice = propertyPrice + 5000;}
				else {propertyPrice = propertyPrice;}
				
				System.out.println("How close is highway?");
				highwayAccessibility = scan.nextFloat();
				if (highwayAccessibility <= 1) {propertyPrice = propertyPrice + 15000;}
				else if (highwayAccessibility > 1 && highwayAccessibility <= 5) {propertyPrice = propertyPrice + 8000;}
				else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {propertyPrice = propertyPrice + 4000;}
				else {propertyPrice = propertyPrice;}
				
				System.out.println("What's the rating of nearest school?");
				schoolScore = scan.nextFloat();
				if (schoolScore >= 8 && schoolScore <= 10) {propertyPrice = propertyPrice + 45000;}
				else if (schoolScore >= 4 && schoolScore < 8) {propertyPrice = propertyPrice + 20000;}
				else {propertyPrice = propertyPrice + 5000;}
				
				System.out.println("Does any of your family members smoke?");
				smoking = scan.nextBoolean();
				if (smoking) {propertyPrice = propertyPrice - 5000;					
				}else {propertyPrice = propertyPrice;}
				
				System.out.println("Market report has been generated.");
				System.out.println("Your estimate market price is: "+ propertyPrice + "$");		
				
				
			}else if (houseType.equals("Single Family Home") || houseType.equals("single family home")) {
				propertyPrice = 95000;
				
				System.out.println("How many bedrooms do you have?");
				numberOfBedrooms = scan.nextInt();
				propertyPrice= propertyPrice + (numberOfBedrooms * 30000);
				
				System.out.println("Do you have a backyard?");
				backyard = scan.nextBoolean();
				if (backyard){propertyPrice = propertyPrice + 5000;
				}else {propertyPrice = propertyPrice;}
				
				System.out.println("Do you have garage?");
				garage = scan.nextBoolean();
				if (garage) {System.out.println("How many spots?");
					garageSpots = scan.nextInt();
					if (garageSpots <= 10) { propertyPrice = propertyPrice + garageSpots * 20000;
					}else if (garageSpots > 10){System.out.println("Pardon, it's not a public parking!");}
				}
				
				System.out.println("How close is metro station?");
				metroAccessibility = scan.nextFloat();
				if (metroAccessibility <= 1) {propertyPrice = propertyPrice + 10000;}
				else if (metroAccessibility > 1 && metroAccessibility <= 3) {propertyPrice = propertyPrice + 5000;}
				else {propertyPrice = propertyPrice;}
				
				System.out.println("How close is highway?");
				highwayAccessibility = scan.nextFloat();
				if (highwayAccessibility <= 1) {propertyPrice = propertyPrice + 15000;}
				else if (highwayAccessibility > 1 && highwayAccessibility <= 5) {propertyPrice = propertyPrice + 8000;}
				else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {propertyPrice = propertyPrice + 4000;}
				else {propertyPrice = propertyPrice;}
				
				System.out.println("What's the rating of nearest school?");
				schoolScore = scan.nextFloat();
				if (schoolScore >= 8 && schoolScore <= 10) {propertyPrice = propertyPrice + 45000;}
				else if (schoolScore >= 4 && schoolScore < 8) {propertyPrice = propertyPrice + 20000;}
				else {propertyPrice = propertyPrice + 5000;}
				
				System.out.println("Does any of your family members smoke?");
				smoking = scan.nextBoolean();
				if (smoking) {propertyPrice = propertyPrice - 5000;					
				}else {propertyPrice = propertyPrice;}
				
				System.out.println("Market report has been generated.");
				System.out.println("Your estimate market price is: "+ propertyPrice + "$");		
			
			}else { System.out.println("Invalid House Type!");}
			
			scan.close();
			

	}

}
