package org.mitz.extractmethod;

import java.util.Enumeration;
import java.util.Vector;

public class ClassA {

	private Vector _orders;
	private String _name;

	void printOwing() {
		printBanner();
		double outstanding = getOutstanding();
		printDetails(outstanding);
	}

	private double getOutstanding() {
		Enumeration e = _orders.elements();
		double result = 0.0;
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}

	void printBanner() {
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");
	}

	void printDetails(double outstanding) {
		System.out.println("name:" + _name);
		System.out.println("amount" + outstanding);
	}
}
