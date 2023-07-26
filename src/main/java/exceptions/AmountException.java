package exceptions;

public class AmountException extends RuntimeException{
	public static void exception() {
		throw new AmountException();
	}
}
