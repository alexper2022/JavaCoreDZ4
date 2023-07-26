package shop;

/**
 * 1. Написать класс покупатель (ФИО, возраст, телефон)
 */
public class Customer {
	public String fio;
	public int age;
	public String phone;

	public Customer(String fio, int age, String phone) {
		this.fio = fio;
		this.age = age;
		this.phone = phone;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer: " +
				"fio='" + fio + '\'' +
				", age=" + age +
				", phone='" + phone + '\'' +
				'.';
	}
}
