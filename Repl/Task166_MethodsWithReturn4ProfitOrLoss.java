package assignments.repl;

public class Task166_MethodsWithReturn4ProfitOrLoss {

	public static void main(String[] args) {
//		c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
//		it returns a string value that can be "profit","loss","no loss"
//
//		for example:
//		c_profits(100,1500)
//		returns : "profit"
//
//		c_profits(20,5)
//		returns : "loss"
//
//		c_profits(100,100)
//		returns : "no loss"
		
		System.out.println(c_profits(20,20));

	}
	public static String c_profits(int buyPrice,int sellPrice){
	    //your code here
		String result ="";
		if(buyPrice<sellPrice) {
			result = "profit";
		}else if(buyPrice>sellPrice) {
			result = "loss";
		}else if(buyPrice==sellPrice) {
			result = "no loss";
		}
	   
	   return result;
	   
	}

}
