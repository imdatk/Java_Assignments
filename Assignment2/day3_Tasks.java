package assignments.day_3;

public class day3_Tasks {

	public static void main(String[] args) {
		/* Task 1: Declare and initialize an integer variable called count, 
		 * and write a statement that displays the value of count on the console */
			int count; count = 5;
			System.out.println(count);
		
		/* Task 2: Declare and initialize a String variable called message, 
		 * and write a statement to display its value to console. */

			String message; message = "Hello World!";
			System.out.println();
			System.out.println(message);
			
		/* Task 3: Declare two variables. One of them integer called num and 
		 * the other one is double called cost. Print both values (num first, then cost),
		 * separated by a space on a single line. */
			
			int num;
			double cost;
			num = 5; cost = 3.1;
			System.out.println();
			System.out.println(num + " " + cost);
		
		/*  Task 4: Assume that word is a String variable and already has a value.
		 * Write a statement to display the message "Today's Word-Of-The-Day is: " 
		 * followed by the value of the word. The message and the value of word 
		 * should appear together, on a single line. Ex: Today's Word-Of-The-Day is: Java  */
			
			String word = "Gewohnung";
			System.out.println();
			System.out.println("Today's Word-of-the-Day is: " + word);
			
		/* Task 5: Declare and initialize two variables called first and second. 
		 * Write a single statement that will print the message "first is " 
		 * followed by the value of first, and then space, followed by "second = ",
		 * followed by the value of the second. Ex: first is 55 second = 123 */
			
			short first = 15;
			float second = 1.5f;
			System.out.println();
			System.out.println("first is " + first + " second = " + second);
			
		/* Task 6: Five friends are going to the theater. They have purchased a row of 
		 * five seats with an aisle on either end. Declare 5 String variables and
		 * store their names. James doesn't want to sit next to Jill, Betty and Herb
		 * are dating and want to sit next to each other. Bob wants to sit on a left side aisle.
		 * James wants to sit on the aisle.
		 * Provide a seating order that conforms to the above rules. 
		 * An example of an invalid seating order is: James, Betty, Herb, Bob, Jill
		 * The above arrangement is invalid because: Bob is not sitting on the left aisle.
		 * Specify the seating order as the names separated by commas and space (as in the above example).
		 * Use variables and print names in the right order. */
			
			String leftAisle = "Bob";
			String rightAisle = "James";
			String middleSeat = "Betty";
			String secondLeft ="Jill";
			String secondRight ="Herb";
			System.out.println();
			System.out.println(leftAisle + ", " + secondLeft + ", " + middleSeat + ", "
			                    + secondRight + ", " + rightAisle );
			
		/* Task 7: Declare and initialize an integer variable i and a floating-point variable f.  
		 * Write a statement that writes both of their values to console in the following format:
		 * i=value-of-i f=value-of-f 
		 * Ex: Assume i = 9 and f = 33.4 The output should be: i=9 f=33.4 */
			
			int i;
			float f;
			i = 15; f = 22.4f;
			System.out.println();
			System.out.println("i=" + i + " f=" + f);
			
		/* Task 8: Declare and assign 2 String variables. They will hold different 
		 * programming language names. Using those variables print the message exactly like below.
		 * Ex: Assume lan1 = "Java" and lan2 = "SQL" 
		 * You need to print exactly: I will learn "Java" and "SQL" at CybertekSchool. */
			
			String PL1, PL2;
			PL1 ="Java"; PL2 = "Selenium";
			System.out.println();
			System.out.println("I will learn \"" + PL1 + "\" and \"" + PL2 + "\" at CybertekSchool.");
			
		/* Task 9: Declare a byte variable named steps and assign 100
		 * Declare a short variable named miles and assign 5000
		 * Declare an int variable named count and assign 1000000
		 * Declare a long variable named population and assign 3434455667 */
			
			byte steps = 100;
			short miles = 5_000;
			int Count = 1_000_000;
			float population = 3434455667f; // 3434455667 is out of range with long 
			
			System.out.println();
			System.out.println(steps + " " + miles + " " + Count + " "  + population);
			
		/* Task 10: In this assignment, you will write code to put together the time of the day.
		 * Like this: 12:24:33 PM
		 * 1. Declare variables: hour, minute, second that can hold int values.
		 * Declare amOrPm variable that can hold a String ("AM" or "PM")
		 * 2. An instructor will set different values to your variables
		 * 3. Using the variables and concatenation, print values in the format mentioned above. */
			
			int Hour, Minute, Second;
			String amOrPm;
			char ikiNokta = 58;
			Hour = 2; Minute = 43; Second = 44; amOrPm = "PM";
			System.out.println();
			System.out.println("Time: " + Hour + ikiNokta + Minute + ikiNokta + Second + " " + amOrPm);

	}

}
