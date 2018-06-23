package org.mitz.inlinetemp;

public class InlineTemp {
	Order anOrder;
	
	boolean m1() {
		return (anOrder.basePrice() > 1000);
	}
}

class Order{

	public double basePrice() {
		return 0;
	}
	
	
}
