package assignments.day04;

public class Assignment3_Question6 {

	public static void main(String[] args) {
		/*Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
		 * Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.
		 * Sample Output
		 *    Number of milligrams in drink: 500
		 *    It would take about 20 drinks for a lethal overdose */
		
		int numberOfMiligrams, numberOfDrinks;
		final int limitToKill = 10000;
		numberOfMiligrams = 500;
		numberOfDrinks = (limitToKill / numberOfMiligrams);
		System.out.println("Number of milligrams in drink: " + numberOfMiligrams);
		System.out.println("It would take about " + numberOfDrinks + " drinks for a lethal overdose.");
	}

}
