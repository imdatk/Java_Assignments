package a_repl.A161_180;

public class Task176_MethodsWithReturn9 {
//	To book  a room first it needs to be available for rent and make sure its available at the date 
//	selected:
//
//		the room is already booked between 7/1/2018 - 7/8/2018 and not available
//		accepting bookings only for year of 2018
//
//		example:
//
//		simpleRoomBook(false,2,1,2018)
//		return false
//
//		simpleRoomBook(true,2,1,2018)
//		return true
//
//		simpleRoomBook(true,7,2,2018)
//		return false

	public static void main(String[] args) {
		System.out.println(simpleRoomBook(false,2,1,2018));
		System.out.println(simpleRoomBook(true,2,1,2019));
		System.out.println(simpleRoomBook(true,7,1,2018));
		System.out.println(simpleRoomBook(true,7,9,2018));
		System.out.println(simpleRoomBook(true,1,9,2018));
	}
	
	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
		boolean sonuc = false;
		if(!isAvailable) {
			return sonuc;
		}else {
			if(year!=2018) {
				return sonuc;
			}else {
				if(month==7 && day>=1 && day<9) {
					return sonuc;					
				}else {
					sonuc = true;
					return sonuc;
				}
				
			}
			
		}
	    
	   
	}

}
