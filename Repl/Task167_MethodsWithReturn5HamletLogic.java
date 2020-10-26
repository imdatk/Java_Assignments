package assignments.repl;

public class Task167_MethodsWithReturn5HamletLogic {

	public static void main(String[] args) {
//		The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
//
//		the hamletQuote method only returns true if one of  or both of the boolean parameters is true.
//
//		example:
//
//		hamletQuote(true, false)
//		returns true
//
//		hamletQuote(false,true)
//		returns true
//
//		hamletQuote(true,true)
//		returns true
//
//		hamletQuote(false,false)
//		returns false
//
//		hint: use the truth table for this one, this can be done with one if and a logical operator.
       System.out.println(hamletQuote(true, false));

	}
	
	public static boolean hamletQuote(boolean toBe,boolean notToBe){
		boolean hamlet = true;
		
		if(toBe != notToBe) {
			hamlet = true;
			
		}else if(toBe == notToBe) {
			if(toBe) {
				hamlet = true;
			}else {
				hamlet=false;
			}
			
		}
		return hamlet;
	      
	    
	 }

}
