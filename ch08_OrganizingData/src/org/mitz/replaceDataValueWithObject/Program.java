package org.mitz.replaceDataValueWithObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		Collection orders = new ArrayList<>();
		String customer = "DN";
		int numberOfOrdersFor = numberOfOrdersFor(orders, customer);
	}

	private static int numberOfOrdersFor(Collection orders, String customer) {
		int result = 0;
		Iterator iter = orders.iterator();
		while (iter.hasNext()) {
			Order each = (Order) iter.next();
			if (each.getCustomerName().equals(customer))
				result++;
		}
		return result;
	}
}
