package org.mitz.replacetempwithquery;

public class ReplaceTempWithQuery {

	private int _quantity;
	private int _itemPrice;

	double getPrice() {
		final double discountFactor = discountFactor();
		return basePrice() * discountFactor;
	}
	
	private int basePrice() {
		return _quantity * _itemPrice;
	}
	
	private double discountFactor() {
		if (basePrice() > 1000) return 0.95;
		else return 0.98;
	}
}
