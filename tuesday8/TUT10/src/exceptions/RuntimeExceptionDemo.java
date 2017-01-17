package exceptions;

import Prog1Tools.IOTools;

/**
 * This class demonstrates Unchecked Exceptions which are also known as Runtime
 * Exceptions.
 * 
 * Runtime Exceptions are normally declared in the function signature but can be
 * ommited. The documentation should indicate why an exception is thrown.
 */
public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		// Exceptions must be caught or else the program terminates
		// System.out.println(addPositive(-1, 0));
		// System.out.println(addPositive(0, 1));
		int a = 0;
		int b = 0;
		do {
			a = IOTools.readInt("Positive Number 1:");
			b = IOTools.readInt("Positive Number 2:");
			if (a < 0 | b < 0) {
				System.out.println("Please enter at least 0 for both numbers!");
			}
		} while (a < 0 | b < 0);

		int c = addPositive(a, b);
		System.out.println("Result: " + c);
	}

	/**
	 * Adds to positive numbers together. Throws an IllegalArgumentException if
	 * any of the parameter are negative
	 * 
	 * @param a
	 *            any integer a; a >= 0
	 * @param b
	 *            any integer b; b >= 0
	 * @return the sum of a and b
	 */
	public static int addPositive(int a, int b) throws IllegalArgumentException {
		if (a < 0 | b < 0) {
			// IllegalArgumentException and all other RuntimeException extend
			// RuntimeException
			throw new IllegalArgumentException("Parameters must be positiv!");
		}
		return a + b;
	}
}
