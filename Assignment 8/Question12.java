package Assignment8;

public class Question12 {

	public static void main(String[] args) {
//		The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
//		the hamletQuote method only returns true if one of or both of the boolean parameters is true.
//		example:
//		hamletQuote(true, false)
//		returns true
//		hamletQuote(false,true)
//		returns true
//		hamletQuote(true,true)
//		returns true
//		hamletQuote(false,false)
//		returns false
		
		hamletQuote(false, false);

	}

	private static void hamletQuote(boolean b, boolean c) {
		if(b == true || c==true ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
