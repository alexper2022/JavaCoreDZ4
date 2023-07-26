/**
 * 1. Написать классы покупатель (ФИО, возраст, телефон), товар (название, цена)
 * и заказ (объект покупатель, объект товар, целочисленное количество).
 * 2. Создать массив покупателей (инициализировать 2 элемента), массив товаров
 * (инициализировать 5 элементов) и массив заказов (пустой на 5 элементов).
 * 3. Создать статический метод «совершить покупку» со строковыми параметрами,
 * соответствующими полям объекта заказа. Метод должен вернуть объект заказа.
 * 4. Если в метод передан несуществующий покупатель – метод должен выбросить
 * исключение CustomerException, если передан несуществующий товар, метод
 * должен выбросить исключение ProductException, если было передано
 * отрицательное или слишком больше значение количества (например, 100),
 * метод должен выбросить исключение AmountException.
 * 5. Вызвать метод совершения покупки несколько раз таким образом, чтобы
 * заполнить массив покупок возвращаемыми значениями. Обработать исключения
 * следующим образом (в заданном порядке):
 * - если был передан неверный товар – вывести в консоль сообщение об ошибке,
 * не совершать данную покупку;
 * - если было передано неверное количество – купить товар в количестве 1;
 * - если был передан неверный пользователь – завершить работу приложения
 * с исключением.
 * 6. Вывести в консоль итоговое количество совершённых покупок после выполнения
 * основного кода приложения.
 */

import shop.Customer;
import shop.Order;
import shop.Product;

import java.util.ArrayList;
import java.util.List;

import static exceptions.ExceptionsProcessing.*;
import static shop.CreateOrder.*;


public class Main {

	public static void main(String[] args) {

		//	1. Написать классы покупатель (ФИО, возраст, телефон), товар (название, цена)
		//	   и заказ (объект покупатель, объект товар, целочисленное количество).

		// 2. Создать массив покупателей (инициализировать 2 элемента)
		List<Customer> customers = new ArrayList<>();
		Customer customer1 = new Customer("Ivanov Ivan Ivanovich", 45, "+79153151234");
		Customer customer2 = new Customer("Petrov Petr Petrovich", 40, "+79153154321");
		customers.add(customer1);
		customers.add(customer2);

		// массив товаров (инициализировать 5 элементов)
		List<Product> products = new ArrayList<>();
		Product product1 = new Product("Watermelon 1kg", 25);
		Product product2 = new Product("Melon 1kg", 30);
		Product product3 = new Product("Tomatoes 1kg", 20);
		Product product4 = new Product("Peaches 1kg", 80);
		Product product5 = new Product("Persimmon 1kg", 120);
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);

		// и массив заказов (пустой на 5 элементов).
		List<Order> orders = new ArrayList<>(5);

		
		String customerInOrder1 = "Ivanov Ivan Ivanovich";
		String productInOrder1 = "Watermelon 1kg";
		int count1 = 3;

		String customerInOrder2 = "Petrov Petr Petrovich";
		String productInOrder2 = "Persimmon 1kg";
		int count2 = 4;

		String customerInOrder3 = "Ivanov Ivan Ivanovich";
		String productInOrder3 = "Tomatoes 1kg";
		int count3 = 15;

		String customerInOrder4 = "Petrov Petr Petrovich";
		String productInOrder4 = "Potato 1kg";
		int count4 = 3;

		String customerInOrder5 = "Nikolaev Ivan Ivanovich";
		String productInOrder5 = "Peaches 1kg";
		int count5 = 4;

		System.out.println("\nAdd first order:");
		if (checkOrder(customerInOrder1, customers, productInOrder1, products, count1)) {
			orders.add(createOrder(customerInOrder1, customers, productInOrder1, products, count1));
			System.out.println(createOrder(customerInOrder1, customers, productInOrder1, products, count1));
		}
		System.out.println("\nAdd second order:");
		if (checkOrder(customerInOrder2, customers, productInOrder2, products, count2)) {
			orders.add(createOrder(customerInOrder2, customers, productInOrder2, products, count2));
			System.out.println(createOrder(customerInOrder2, customers, productInOrder2, products, count2));
		}
		System.out.println("\nAdd third order:");
		System.out.println("Add order with a bad count:");
		if (checkOrder(customerInOrder3, customers, productInOrder3, products, count3)) {
			orders.add(createOrder(customerInOrder3, customers, productInOrder3, products, count3));
			System.out.println(createOrder(customerInOrder3, customers, productInOrder3, products, count3));
		}
		System.out.println("\nAdd fourth order:");
		System.out.println("Add order with a product not in stock:");
		if (checkOrder(customerInOrder4, customers, productInOrder4, products, count4)) {
			orders.add(createOrder(customerInOrder4, customers, productInOrder4, products, count4));
			System.out.println(createOrder(customerInOrder4, customers, productInOrder4, products, count4));
		}

		System.out.println("\nPrint order list:");
		for (Order order : orders) {
			System.out.println(order.toString());
		}
		System.out.println("\nAdd order with a non exist user:");
		if (checkOrder(customerInOrder5, customers, productInOrder5, products, count5)) {
			orders.add(createOrder(customerInOrder5, customers, productInOrder5, products, count5));
		}
	}


}
