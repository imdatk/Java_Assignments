package a_repl.A201_220;

import java.util.ArrayList;

//	Create a static method that:
//	is called repeatAL
//	returns nothing
//	takes in a single parameter - an ArrayList of Booleans
//	
//	This method should modify its ArrayList parameter by repeating its 
//	ArrayList values.  
//	
//	For example, if the parameter is 
//	(true, false, false)
//	The modified ArrayList should be
//	(true, false, false, true, false, false)

public class Task206_ArrListRepeatAll {

	public static void main(String[] args){
		ArrayList<Boolean> bol = new ArrayList<>();
		bol.add(true);
		bol.add(false);
		bol.add(true);
		repeatAL(bol);
	}
	//create your method below
	public static void repeatAL(ArrayList<Boolean> bol) {
		bol.addAll(bol);
		
		
		System.out.println(bol);
		
	}

}
