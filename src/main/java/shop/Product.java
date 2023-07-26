package shop;

/**
 * 1. Написать класс товар (название, цена)
 */
public class Product {
	public String name;
	public int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product: " +
				"name='" + name + '\'' +
				", price='" + price + '\'' +
				'.';
	}
}
