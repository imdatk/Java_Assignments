package a_repl.A141_160;

public class Task157_yedek {

	public static void main(String[] args) {
		
		String s = "11:05:05AM";
//		s = "12:30:05PM";
//		s = "12:25:32PM";
//		s = "12:05:05AM";
//		s = "12:00:00PM";
//		s = "12:00:00AM";
		
		if(s.equals("12:00:00AM")) {
			System.out.println("00:00:00");
		}else if(s.equals("12:00:00PM")) {
			System.out.println("12:00:00");
		}else {
			if(s.substring(8).equals("AM") && s.substring(0,2).equals("12")){
				s = "00" + s.substring(2,s.length()-2);
				System.out.println(s);
			}else if(s.substring(8).equals("AM")) {
				System.out.println(s.substring(0,s.length()-2));
			}else if(s.substring(8).equals("PM") && s.substring(0,2).equals("12")) {
				s = s.substring(0,s.length()-2);
				System.out.println(s);
			}else if(s.substring(8).equals("PM")) {
				s = (Integer.parseInt(s.substring(0,2))+12) + s.substring(2, s.length()-2);
				System.out.println(s);
			}
		}

	}

}
