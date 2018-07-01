package org.mitz.changeValueToReference;

public class Order {
	private Customer _customer;

	public Order(String customerName) {
		_customer = Customer.create(customerName);
	}

	public void setCustomer(String customerName) {
		_customer =  Customer.create(customerName);
	}

	public String getCustomerName() {
		return _customer.getName();
	}
}
