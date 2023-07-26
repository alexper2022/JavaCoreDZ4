package exceptions;

public class CustomerException extends RuntimeException {
	public static void exception() {
		throw new RuntimeException("Customer not in base!");
	}
}
