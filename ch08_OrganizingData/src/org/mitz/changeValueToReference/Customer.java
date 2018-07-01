package org.mitz.changeValueToReference;

import java.util.Hashtable;

public class Customer {
	private final String _name;
	private static Hashtable _instances = new Hashtable();

	private Customer(String name) {
		_name = name;
	}

	public static Customer getNamed(String name) {
		return (Customer) _instances.get(name);
	}

	static void loadCustomers() {
		new Customer("Lemon Car Hire").store();
		new Customer("Associated Coffee Machines").store();
		new Customer("Bilston Gasworks").store();
	}

	private void store() {
		_instances.put(this.getName(), this);
	}

	public String getName() {
		return _name;
	}

}