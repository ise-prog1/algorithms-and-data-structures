package exceptions;

import Prog1Tools.IOTools;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		// Exceptions must be caught or else the program terminates
		// System.out.println(addPositive(-1, 0));
		// System.out.println(addPositive(0, 1));
		int a = 0;
		int b = 0;
		do {
			a = IOTools.readInt("Positive Zahl 1:");
			b = IOTools.readInt("Positive Zahl 2:");
			if (a < 0 | b < 0) {
				System.out.println("Bitte mindestens 0 eingeben!");
			}
		} while (a < 0 | b < 0);
		int c = addPositive(a, b);
		System.out.println("Ergebnis: " + c);
	}

	public static int addPositive(int a, int b) {
		if (a < 0 | b < 0) {
			throw new IllegalArgumentException("Parameters must be positiv!");
		}
		return a + b;
	}
}
