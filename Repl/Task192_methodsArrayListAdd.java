package a_repl.A181_200;

import java.util.ArrayList;



public class Task192_methodsArrayListAdd {

	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		strs.add("Hello");
		strs.addAll(test());
		System.out.println(strs);

	}
	
	public static ArrayList<String> test(){
		ArrayList<String> names = new ArrayList<String>();
		//write code below
		names.add("Ali");
		names.add("Veli");
		names.add("Hasan");
		
		//leave below code alone
		return names;
	}

}
