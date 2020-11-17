package a_repl.A161_180;

import java.util.Arrays;
import java.util.Scanner;

public class Task170_SolutionSaim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        
        int day = 0;

        do {

            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));

            int [] temp = Arrays.copyOf(inhabitants, inhabitants.length);

            for(int i=0; i < inhabitants.length; i++) {

                if(temp[i] == 0){
                    if(i == 0) {
                        inhabitants[i+1] = temp[i+1]/2;
                    } else if (i == inhabitants.length-1) {
                        inhabitants[i-1] = temp[i-1]/2;
                    } else {
                        inhabitants[i+1] = temp[i+1]/2;
                        inhabitants[i-1] = temp[i-1]/2;
                    }
                }

            }

        } while(!Arrays.equals(inhabitants, new int[8]));

        System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

	}
//	3, 6, 0, 4, 3, 2, 7, 0

}
