package Assignment5;

public class Question03_EvenNumbers {

	public static void main(String[] args) {
//		Write a program that displays the number of even numbers between 5 and 50 (included)
		int count = 0;
		System.out.print("Even Numbers: ");
		for (int i=5; i<=50; i++) {
			if(i%2 == 0) {
				
				System.out.print (i + " ");
				count++;
				
			}
			
		}
		System.out.println();
		System.out.println("Total Number of Even Numbers: " + count);

	}

}
