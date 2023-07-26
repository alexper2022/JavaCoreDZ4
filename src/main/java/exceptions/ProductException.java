package exceptions;

public class ProductException extends RuntimeException {
	public static void exception() {
		throw new ProductException();
	}
}
