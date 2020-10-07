package Assignment5;

public class Question14_Nested {

	public static void main(String[] args) {
//		Write nested loop to draw this pattern
//
//		##
//		# #
//		#  #
//		#   #
//		#    #
//		#     #
//		#       #
		
		for (int i=1; i<=7; i++) {
			System.out.print("#");
			for(int j=1;j<i;j++) {  // ilkinde bosluk vermemek icin <= yerine < yapiyoruz.
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println();
		}
				
	}
}
