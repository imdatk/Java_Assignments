package assignments.repl;

public class Task071_Evens {

	public static void main(String[] args) {
		int lastNumber=100;
		for (int i=1; i<=lastNumber; i++) {
			if(i%2 == 0 && i<=2) {
				System.out.print(i);
			}
			if(i%2 == 0 && i>2) {
				System.out.print(",");
				System.out.print(i);
			}
		}
	}

}
