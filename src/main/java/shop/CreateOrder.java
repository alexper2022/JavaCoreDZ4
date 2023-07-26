package shop;

import exceptions.AmountException;
import exceptions.CustomerException;
import exceptions.ProductException;

import java.util.List;

public class CreateOrder {
	public static int MAX_KG_IN_ORDER = 10; // Максимум килограмм для единоразовой покупки

	public static Order createOrder(String customer, List<Customer> customers, String product, List<Product> products, int count) {
		try {
			customerEnableInArray(customer, customers);
			productInStock(product, products);
			if (count > MAX_KG_IN_ORDER || count < 1) {
				count = 1;
				AmountException.exception();
			}
		} catch (AmountException e) {
//			System.out.println("Amount false!");
			return new Order(customerEnableInArray(customer, customers),productInStock(product, products), count);

		} catch (ProductException e) {
			System.out.println("Product not in base!");
		}
		return new Order(customerEnableInArray(customer, customers),productInStock(product, products), count);
	}

	public static Product productInStock(String product, List<Product> products) {
		Product inStock = null;
		for (Product prod : products) {
			if (product == prod.getName()) {
				inStock = prod;
				break;
			}


		}
		if(inStock == null) ProductException.exception();
		return inStock;
	}

	public static Customer customerEnableInArray(String customer, List<Customer> customers) {
		Customer customerEnable = null;
		for (Customer custom : customers) {
			if (customer == custom.getFio()) {
				customerEnable = custom;
				break;
			}
		}
		if (customerEnable == null) CustomerException.exception();
		return customerEnable;
	}
}
