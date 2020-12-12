package a_repl.A201_220;

import java.util.ArrayList;

//This task is optional, since we did not practice ArrayLists in this way.
//
//blogDb gets an ArrayList of String Arrays(ArrayList<String[]>) from a database,
//each row from the database table is represented by a position in the ArrayList. 
//Each ArrayList position holds a string array that holds the row data.
//the database table columns are : id(string),title(string), content(string).
//
//ArrayList<String[]> r example:
//Each item in ArrayList is a String Array
//
//r = [
//["1","title","content1"],
//["2","another title","content2"],
//["3","yet another title","content3"]
//]
//
//the String id argument of blogDb method is referring to a row from the table the
//arraylist holds.
//You need to loop through each element in the ArrayList and find the matching 
//String[] with that id.
//Then return the title and content in the format below.
//
//for example
//
//blogDb(r,"1")
//returns:
//title
//content1
//
//blogDb(r,"2")
//returns:
//another title
//content2
//
//when you return the string make sure there is a line break between the title
//and content. You can use " \n " to line break in a string

public class Task216_ArrayListBlogPost {

	public static void main(String[] args) {
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	    String post = blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	}
	
	public static String blogDb(ArrayList<String[]> r,String id)  {
	    String str1 =""; 
			String str2 =""; 
			for(int i=0; i<r.size();i++) {
		    	for(int j=0; j<r.get(i).length; j++) {
		    		if(r.get(i)[j].equals(id)) {
		    			str1 = r.get(i)[1];
		    			str2 = r.get(i)[2];
		    			break;
		    		}
		    	}
		    }
		    return str1 + "\n" + str2; 
	    
	   
	  }

}
