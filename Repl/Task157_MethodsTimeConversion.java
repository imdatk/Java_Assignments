package assignments.repl;

import java.util.Scanner;

public class Task157_MethodsTimeConversion {

	public static void main(String[] args) {
//		Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
//		Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
//		Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//		Function Description
//		It should print a new string representing the input time in 24 hour format.
//		timeConversion has the following parameter(s):
//		s: a string representing time in  12 hour format
//
//		Input: 07:05:45PM
//		Output: 19:05:45
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time in 12 hour format: ");
		
		timeConversion(scan.nextLine());
		
		
		
		
//		 String time = "3:30 PM";
//
//		    SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");
//
//		    SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");
//
//		    System.out.println(date24Format.format(date12Format.parse(time)));
		
//		String word = "12:30:20PM";
//		int hour = Integer.parseInt(word.substring(0, word.indexOf(':')));
//		int minutes = Integer.parseInt(word.substring(word.indexOf(0)+4,word.indexOf(0)+6));
//		int seconds = Integer.parseInt(word.substring(word.indexOf(0)+7,word.indexOf(0)+9));
//		String amOrPm = word.substring(word.indexOf(0)+9,word.length());
//		System.out.println(hour);
//		System.out.println(minutes);
//		System.out.println(seconds);
//		System.out.println(amOrPm);
		
	}

	
	private static void timeConversion(String s) {
		if(s.length()==9) {
			s="0"+s;
		}
		if(s.equals("12:00:00AM")) {
			System.out.println("00:00:00");
		}else if(s.equals("12:00:00PM")) {
			System.out.println("12:00:00");
		}else {
			if(s.substring(8).equals("AM") && s.substring(0,2).equals("12")){
				s = "00" + s.substring(2,s.length()-2);
				System.out.println(s);
			}else if(s.substring(8).equals("AM")) {
				System.out.println(s.substring(0,s.length()-2));
			}else if(s.substring(8).equals("PM") && s.substring(0,2).equals("12")) {
				s = s.substring(0,s.length()-2);
				System.out.println(s);
			}else if(s.substring(8).equals("PM")) {
				s = (Integer.parseInt(s.substring(0,2))+12) + s.substring(2, s.length()-2);
				System.out.println(s);
			}
		}
		
	}
//	private static void timeConversion(String s) {
//		if(s.length() == 9) {
//			s = "0" + s;
//		}
//		if(s.equals("12:00:00AM")) {
//			System.out.println("00:00:00");
//		}else if(s.equals("12:00:00PM")) {
//			System.out.println("12:00:00");
//		}else {
//			int hour = Integer.parseInt(s.substring(0, s.indexOf(':')));
//			int minutes = Integer.parseInt(s.substring(s.indexOf(0)+4,s.indexOf(0)+6));
//			int seconds = Integer.parseInt(s.substring(s.indexOf(0)+7,s.indexOf(0)+9));
//			String amOrPm = s.substring(s.indexOf(0)+9,s.length());
//			if(amOrPm.equals("AM")) {
//				if (hour==12) {
//					if(minutes<10) {
//						System.out.println("00:0" + minutes + ":" + seconds);
//					}else if(seconds<10) {
//					System.out.println("00:" + minutes + ":0" + seconds);
//					}else if(minutes<10 && seconds<10) {
//					System.out.println("00:0" + minutes + ":0" + seconds);
//					}else {
//					System.out.println("00:" + minutes + ":" + seconds);
//					}
//				
//				}else {
//					if(hour<10) {
//						System.out.println("0" + hour + ":" + minutes + ":" + seconds);
//					}else if(minutes<10) {
//							System.out.println(hour + ":0" + minutes + ":" + seconds);
//					}else if(seconds<10) {
//						System.out.println(hour + ":" + minutes + ":0" + seconds);
//					}else if(minutes<10 && seconds<10) {
//						System.out.println(hour + ":" +  "0" + minutes + ":0" + seconds);
//					}else if(hour<10 && seconds<10) {
//						System.out.println("0" + hour + ":" + minutes + ":0" + seconds);
//					}else if(hour<10 && minutes<10) {
//						System.out.println("0" + hour + ":" + "0" + minutes + ":" + seconds);
//					}else if(hour<10 && minutes<10 && seconds<10) {
//						System.out.println("0" + hour + ":0" + minutes + ":0" + seconds);
//					}else {
//						System.out.println(hour + ":" + minutes + ":" + seconds);
//					}
//					
//				}
//				
//			}else if(amOrPm.equals("PM")) {
//				if (hour==12) {
//					if(minutes<10) {
//						System.out.println(hour + ":0" + minutes + ":" + seconds);
//					}else if(seconds<10) {
//					System.out.println(hour + ":" + minutes + ":0" + seconds);
//					}else if(minutes<10 && seconds<10) {
//					System.out.println(hour + ":0" + minutes + ":0" + seconds);
//					}else {
//					System.out.println(hour + ":" + minutes + ":" + seconds);
//					}
//				}else {
//					if(minutes<10) {
//						System.out.println((hour+12) + ":0" + minutes + ":" + seconds);
//					}else if(seconds<10) {
//					System.out.println((hour+12) + ":" + minutes + ":0" + seconds);
//					}else if(minutes<10 && seconds<10) {
//					System.out.println((hour+12) + ":" +  "0" + minutes + ":0" + seconds);
//					}else {
//					System.out.println((hour+12) + ":" + minutes + ":" + seconds);
//					}
//					
//				}
//			}
//		}
//	}
	
	
}
