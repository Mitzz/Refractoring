package org.mitz.changeValueToReference;

public class Customer {
	private final String _name;

	private Customer(String name) {
		_name = name;
	}

	public static Customer create(String name) {
		return new Customer(name);
	}

	public String getName() {
		return _name;
	}

}