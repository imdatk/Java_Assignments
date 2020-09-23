package assignments.day04;

public class Assignment3_Question5 {

	public static void main(String[] args) {
		/* Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.
		 * -Declare int variables inputSeconds, hours, minutes, second.
		 * -Initialize the inputSeconds
		 * -Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds
		 * -Assign values to the hours, minutes, seconds variables
		 * -Display the result
		 * Sample Output:
		 * 	inputSecond is 3695
		 * 	1 hours, 1 minutes, and 35 seconds */
		
		int hours, minutes, seconds, inputSeconds;
		inputSeconds = 2000;
		seconds = inputSeconds%60;
		minutes = (inputSeconds - seconds)%3600/60;
		hours = (inputSeconds - seconds)/3600;
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
		
		
		

	}

}
