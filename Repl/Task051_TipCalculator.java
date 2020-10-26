package assignments.repl;

import java.util.Scanner;

public class Task051_TipCalculator {

	public static void main(String[] args) {
//		Write your code inside the method.
//		Use the values given as method parameters.
//		Assign final values.
//		Then user should select service quality that will correspond to tip percent.
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
//		https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
//
//		Input: 
//		Split:Yes
//		Number of people:4
//		Check amount:476.0
//		Service Quality:Excellent
//
//		Output:
//		 
//		Number of people entered: &&&&
//		Total to pay: 595.0
//		Total tip: 119.0
//		Total per person: 148.75
//		Tip per person: 29.75

		Scanner scan=new Scanner(System.in);
		System.out.println("Split:");
		String split=scan.next();
		
		System.out.println("Number of people:");
		int numberOfPeople=scan.nextInt();
		
		System.out.println("Check amount:");
		double amount=scan.nextDouble();
		
		System.out.println("Service Quality:");
		String serviceQuality=scan.next();
		
		double totalTip=0;
		double totalPay=0;
		double totalPerPerson=0;
		double tipPerPerson=0;
		
		// WRITE YOUR CODE HERE
		if(serviceQuality.equals("Poor") || serviceQuality.equals("poor")){
			totalTip = amount * 0.05;
		}else if(serviceQuality.equals("Fair") || serviceQuality.equals("fair")){
			totalTip = amount * 0.1;
		}else if(serviceQuality.equals("Good") || serviceQuality.equals("good")){
			totalTip = amount * 0.15;
		}else if(serviceQuality.equals("Great") || serviceQuality.equals("great")){
			totalTip = amount * 0.2;
		}else if(serviceQuality.equals("Excellent") || serviceQuality.equals("excellent")){
			totalTip = amount * 0.25;
		}else {System.out.println("Invalid Entry");
		}
		totalPay = amount + totalTip;
		totalPerPerson = totalPay / numberOfPeople; 
		tipPerPerson = totalTip/numberOfPeople;
		
		if(split.equals("yes") || split.equals("Yes")) {
			System.out.print("Number of people entered: ");
			for (int i=1; i<=numberOfPeople; i++) {
				System.out.print("&");
			}System.out.println();
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: "+ totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		}else {
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: "+ totalTip);
		}
		
		
		
//		System.out.println("Split or No Split");
//		String splitOrNoSplit = scan.next();
//		System.out.println("Number of people entered: ");
//		int numberOfPeople = scan.nextInt();
//		System.out.println("Check amount");
//		double checkAmount = scan.nextDouble();
//		System.out.println("Service Quality: ");
//		String serviceQuality = scan.next();
//		
//		double totalTip=0, totalToPay=0;
//		
//		if(serviceQuality.equals("Poor") || serviceQuality.equals("poor")){
//			totalTip = checkAmount * 0.05;
//		}else if(serviceQuality.equals("Fair") || serviceQuality.equals("fair")){
//			totalTip = checkAmount * 0.1;
//		}else if(serviceQuality.equals("Good") || serviceQuality.equals("good")){
//			totalTip = checkAmount * 0.15;
//		}else if(serviceQuality.equals("Great") || serviceQuality.equals("great")){
//			totalTip = checkAmount * 0.2;
//		}else if(serviceQuality.equals("Excellent") || serviceQuality.equals("excellent")){
//			totalTip = checkAmount * 0.25;
//		}else {System.out.println("Invalid Entry");
//		}
//		totalToPay = checkAmount + totalTip;
//		
//		if(splitOrNoSplit.equals("yes") || splitOrNoSplit.equals("Yes")) {
//			System.out.println("Number of people entered: " + numberOfPeople);
//			System.out.println("Total to pay: " + totalToPay);
//			System.out.println("Total tip: "+ totalTip);
//			System.out.println("Total per person: " + (totalToPay / numberOfPeople));
//			System.out.println("Tip per person: " + (totalTip/numberOfPeople));
//		}else {
//			System.out.println("Total to pay: " + totalToPay);
//			System.out.println("Total tip: "+ totalTip);
//		}
		
	}

}
