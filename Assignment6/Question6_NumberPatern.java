package Assignment6;

public class Question6_NumberPatern {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//		1
//		2 6
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15
		
		int j=1, k=1, l=1, m=1, n=1;
		int x=1, y=5, z=8, t=10, u=11;
		
		for (int i=1; i<=5; i++) {
				
				for (j=x; j<=x; j++) {
					System.out.print(x);
				}
					x++;
				if (y>5){ for(k=y; k<=y; k++) {
					System.out.print(" "+ y);
							}
				}
					y++;
				if (z>9) {
					for(l=z; l<=z; l++) {
					System.out.print(" "+z);
					}
				}
					z++;
				if(t>12) {
					for(m=t; m<=t; m++) {
					System.out.print(" "+t);
					}
				}t++;
				if(u>14) {
					for(n=u; n<=u; n++) {
					System.out.print(" "+u);
					}
				}
					u++;
				System.out.println();
		}

	}

}
