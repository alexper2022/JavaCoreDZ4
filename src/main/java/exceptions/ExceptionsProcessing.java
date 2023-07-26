package exceptions;

import shop.CreateOrder;
import shop.Customer;
import shop.Product;

import java.util.List;

public class ExceptionsProcessing {

	public static boolean checkOrder(String customer, List<Customer> customers,
									 String product, List<Product> products,
									 int count) {
		boolean result = true;
		try {
			CreateOrder.createOrder(customer, customers, product, products, count);
		} catch (CustomerException ce) {
//			System.out.println(ce.getMessage());
			result = false;
		} catch (ProductException pe) {
//			System.out.println(pe.getMessage());
			result = false;
		} catch (AmountException ae) {
//			System.out.println(ae.getMessage());
		}
		return result;
	}
}
