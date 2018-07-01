package org.mitz.replaceDataValueWithObject;

public class Order {
	private Customer _customer;

	public Order(String customer) {
		_customer = new Customer(customer);
	}

	public String getCustomer() {
		return _customer.getName();
	}

	public void setCustomer(String arg) {
		_customer = new Customer(arg);
	}

	public String getCustomerName() {
		return _customer.getName();
	}
}
