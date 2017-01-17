package exceptions;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			doError();
			System.out.println("After doError");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
	}
	
	public static void doError() throws Exception {
		if (Math.random() < 0.5)
			throw new Exception();
	}
}
