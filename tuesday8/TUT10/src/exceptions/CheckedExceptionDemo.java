package exceptions;

/**
 * This class demonstrates checked exceptions in Java.
 */
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			doError();
			// An error will immediately stop the execution of the try block.
			// So this will only be printed if no error occured
			System.out.println("After doError");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// A finally block is optional, will always be executed.
			System.out.println("Finally");
		}
	}

	/**
	 * This method might throw an Exception For demo purposes
	 * 
	 * @throws Exception
	 */
	public static void doError() throws Exception {
		// You either have to catch the exception
		// or delegate the catching to the caller
		// by declaring that this method as throwing Exceptions (throws
		// Exception)
		if (Math.random() < 0.5)
			throw new Exception();
	}
}
