package a_repl.A061_80;

import java.util.Scanner;

public class Task080_RouteJacob {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();
		char endChar = end.charAt(0);
		char startChar = start.charAt(0);
		if (endChar == startChar) {
		System.out.println(endChar + " found");
		} else if (endChar == 'A' || endChar > startChar) {
		if (endChar == 'A') {
		endChar = 'E';
		}
		for (; startChar < endChar; startChar++) {
		switch (startChar) {
		case 'A':
		System.out.print("right");
		break;
		case 'B':
		System.out.print("down");
		break;
		case 'C':
		System.out.print("left");
		break;
		case 'D':
		System.out.print("up");
		}
		if ((endChar - startChar) > 1) {
		System.out.print(" > ");
		}
		}
		if (endChar == 'E') {
		endChar = 'A';
		}
		System.out.print(": " + endChar + " found");
		} else if (startChar > endChar) {
		for (; startChar < 'E'; startChar++) {
		switch (startChar) {
		case 'A':
		System.out.print("right");
		break;
		case 'B':
		System.out.print("down");
		break;
		case 'C':
		System.out.print("left");
		break;
		case 'D':
		System.out.print("up");
		}
		System.out.print(" > ");
		}
		for (char init = 'A'; init < endChar; init++) {
		switch (init) {
		case 'A':
		System.out.print("right");
		break;
		case 'B':
		System.out.print("down");
		break;
		case 'C':
		System.out.print("left");
		break;
		case 'D':
		System.out.print("up");
		}
		if ((endChar - init) > 1) {
		System.out.print(" > ");
		}
		}
		System.out.print(": " + endChar + " found");
		}


	}

}
