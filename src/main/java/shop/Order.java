package shop;

/**
 * 1. Написать класс заказ (объект покупатель, объект товар, целочисленное количество).
 */
public class Order {
	public Customer customer;
	public Product product;
	public int count;

	public Order(Customer customer, Product product, int count) {
		this.customer = customer;
		this.product = product;
		this.count = count;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Order: " + customer + ", " + product +
				", count=" + count +
				'.';
	}
}
