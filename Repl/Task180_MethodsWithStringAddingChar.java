package a_repl.A161_180;

public class Task180_MethodsWithStringAddingChar {

	public static void main(String[] args) {
//		coverString method will take 2 string parameters from the caller. 
//
//		Your job is to write an important code that will :
//
//		- to search and find each appearance of coverME within main
//		- then surround it with [coverMe] (square brackets)
//		- if you cannot find the coverME within main after tirelessly looping then just 
//		return whole main itself covered [main].
//		- keep in mind that coverME value can be of any length.
//
//		Examples:
//		coverString("java methods", "me") ) ; ==> "java [me]thods"
//
//		coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
//
//		coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
//
//		coverString("apples", "pears") ) ; ==> "[apples]"
		
//		  System.out.println(coverString("Certified Wooden Spoon", "0") ) ; //java [me]thods
		  System.out.println(coverString("hello hello", "ello") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  int x = main.length();
		  int y = coverME.length();
		  int z=0;
		  int index = 0;
		  int counter = 0;
		  
		  for(int i=0; i<=(x-y); i++) {
			  if(main.substring(i,(i+y)).equals(coverME)){
				  index = main.indexOf(coverME, z); 
				  if(index+y==x) {
					  main = main.substring(0,index) + "[" + coverME + "]";
				  }else {
				  main = main.substring(0,index) + "[" + coverME + "]"
				  + main.substring(index+y);}
				  counter++;
				  z=index+y+1;
				  i++;
				  x+=2;
			  }
			}
		  if(counter == 0) {
			  main = "["+main+"]";
		  }
		  return main;
	  }
}

		
//		String main = "java metjahodsja";
//		String coverMe= "ja";
//		  int x = main.length();
//		  int y = coverMe.length();
//		  int z=0;
//		  int index = 0;
//		  int counter = 0;
//		  
//		  for(int i=0; i<=(x-y); i++) {
//			  if(main.substring(i,(i+y)).equals(coverME)){
//				  index = main.indexOf(coverME, z); // 11
//				  if(index+y==x) {
//					  main = main.substring(0,index) + "[" + coverME + "]";
//				  }else {
//				  System.out.println(index);
//				  main = main.substring(0,index) + "[" + coverME + "]"
//				  + main.substring(index+y);}
////				  System.out.println(indexOfCoverMe);
//				  System.out.println(main);
//				  counter++;
//				  z=index+y+1;
//				  i++;
//				  x+=2;
//			  }
			  
//		  }
//		  System.out.println(counter);
//		  if(counter==0) {
//			  main = "["+main+"]";
//		  }
//	
//	}
//}
