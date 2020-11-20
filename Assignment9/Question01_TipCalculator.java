package Assignment9;

import java.util.Scanner;

public class Question01_TipCalculator {
//		Create a method called tipCalculator which accepts parameters:  
//		boolean isSplit, int numberPeople, double checkAmount, String serviceQuality
//		Ask the user to enter each value. 
//		User should select service quality that will correspond to tip percent.
//		Poor = 5%
//		Fair = 10%
//		Good = 15%
//		Great = 20%
//		Excellent = 25%
//		The program should display the following information based on the user input:
//		Split or No split
//		Number of people entered: &&&&
//		Service Quality:
//		Total to pay:
//		Total tip:
//		Total per person:
//		Tip per person:
//		Input:
//		Split:Yes
//		Number of people:4
//		Check amount:476.0
//		Service Quality:Excellent
//		Output:
//		Number of people entered: &&&&
//		Total to pay: 595.0
//		Total tip: 119.0
//		Total per person: 148.75
//		Tip per person: 29.75
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isSplit = false;
		System.out.println("Split or No Split: ");
		String split = scan.next();
		if(split.equalsIgnoreCase("Yes")) {
			isSplit = true;
		}else {isSplit = false;
		}
		System.out.println("Number of people: ");
		int numberPeople = scan.nextInt();
		System.out.println("Check amount: ");
		double checkAmount = scan.nextDouble();
		System.out.println("Service Quality: ");
		String serviceQuality = scan.next();
		scan.close();

		tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality);

	}

	private static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, 
										String serviceQuality) {
		double totalToPay=0, totalTip=0, totalPerPerson=0, tipPerPerson=0, tipRatio=0;
		
		if(isSplit) {
			if(serviceQuality.equalsIgnoreCase("poor")) {
				tipRatio = 0.05;				
			}else if(serviceQuality.equalsIgnoreCase("fair")){
				tipRatio = 0.10;
			}else if(serviceQuality.equalsIgnoreCase("good")){
				tipRatio = 0.15;
			}else if(serviceQuality.equalsIgnoreCase("great")){
				tipRatio = 0.20;
			}else if(serviceQuality.equalsIgnoreCase("excellent")){
				tipRatio = 0.25;
			}
			totalTip = checkAmount*tipRatio;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay/numberPeople;
			tipPerPerson = totalTip/numberPeople;
			System.out.print("Number of people entered:");
			
			for (int i=1; i<=numberPeople; i++) {
				System.out.print("&");
			}System.out.println();
			System.out.println("Service Quality: " + serviceQuality);
			System.out.println("Total to pay: " + totalToPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: "+ totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		}else {
			if(serviceQuality.equalsIgnoreCase("poor")) {
				tipRatio = 0.05;				
			}else if(serviceQuality.equalsIgnoreCase("fair")){
				tipRatio = 0.10;
			}else if(serviceQuality.equalsIgnoreCase("good")){
				tipRatio = 0.15;
			}else if(serviceQuality.equalsIgnoreCase("great")){
				tipRatio = 0.20;
			}else if(serviceQuality.equalsIgnoreCase("excellent")){
				tipRatio = 0.25;
			}
			totalTip = checkAmount*tipRatio;
			totalToPay = checkAmount + totalTip;
			System.out.print("Number of people entered:");
			for (int i=1; i<=numberPeople; i++) {
				System.out.print("&");
			}System.out.println();
			System.out.println("Service Quality: " + serviceQuality);
			System.out.println("Total to pay: " + totalToPay);
			System.out.println("Total tip: " + totalTip);
						
		}
		
	}

}
