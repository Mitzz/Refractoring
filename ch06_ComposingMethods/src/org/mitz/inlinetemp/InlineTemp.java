package org.mitz.inlinetemp;

public class InlineTemp {
	Order anOrder;
	
	boolean m1() {
		double basePrice = anOrder.basePrice();
		return (basePrice > 1000);
	}
}

class Order{

	public double basePrice() {
		return 0;
	}
	
	
}
