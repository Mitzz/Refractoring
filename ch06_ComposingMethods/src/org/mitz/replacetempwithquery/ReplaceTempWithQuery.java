package org.mitz.replacetempwithquery;

public class ReplaceTempWithQuery {

	private int _quantity;
	private int _itemPrice;

	double getPrice() {
		final int basePrice = _quantity * _itemPrice;
		final double discountFactor;
		if (basePrice > 1000)
			discountFactor = 0.95;
		else
			discountFactor = 0.98;
		return basePrice * discountFactor;
	}
}
