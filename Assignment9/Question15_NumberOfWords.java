package Assignment9;

public class Question15_NumberOfWords {

	public static void main(String[] args) {
//		Print true if the string "cat" and "dog" appear the same number of times
//		in the given string word.
//		Sample Output:
//		     input: catdog
//		     output: true
//		     input: catcat
//		     output: false
//		     input: cat-cheetah-dog-cat
//		     output: false

		System.out.println(catDog("catdogcatdogdo"));
		System.out.println(catDog("catcatdogdog"));
		System.out.println(catDog("1cat1catdog1dog"));


	}

	private static boolean catDog(String str) {
		int counter1=0, counter2=0;
		for(int i=0; i<=str.length()-3; i++) {
			if(str.substring(i,i+3).equals("cat")) {
				counter1++;
			}
			if(str.substring(i,i+3).equals("dog")) {
				counter2++;
			}
		}
		if(counter1==counter2) {
			return true;
		}else {
			return false;
		}
	}

}
