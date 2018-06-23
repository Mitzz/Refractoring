package org.mitz.extractmethod;

import java.util.Enumeration;
import java.util.Vector;

public class ClassA {

	private Vector _orders;
	private String _name;

	void printOwing() {
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		
		// calculate outstanding
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		// print details
		System.out.println("name:" + _name);
		System.out.println("amount" + outstanding);
	}
	
	void printBanner() {
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");
	}
}
