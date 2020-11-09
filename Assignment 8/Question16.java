package Assignment8;

public class Question16 {

	public static void main(String[] args) {
//		To book a room first it needs to be available for rent and make sure its available at 
//		the date selected: the room is already booked between 7/1/2018 - 7/8/2018 and not 
//		available accepting bookings only for year of 2018
//			example:
//			simpleRoomBook(false,2,1,2018)
//			return false
//			simpleRoomBook(true,2,1,2018)
//			return true
//			simpleRoomBook(true,7,2,2018)
//			return false
		
		System.out.println(simpleRoomBook(true,7,9,2018));
		


	}

	private static boolean simpleRoomBook(boolean available, int month, int day, int year) {
		boolean booking = false;
		if (available) {
			if(year == 2018) {
				if(month != 7) {
					booking = true;
				}else {
					if(day>=1 && day<=8) {
						booking = false;
						
					}else {
						booking = true;
					}
					
				}
			}else {
				booking = false;
			}
			
		}else {
			booking =false;
		}
		return booking;
		
	}

}
