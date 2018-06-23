package org.mitz.introducingexplainingvariable;

public class IntroduceExplainingVariable {

	private int _quantity;
	private int _itemPrice;

	double price() {
		final double basePrice = _quantity * _itemPrice;
		final double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		final double shipping = Math.min(basePrice * 0.1, 100.0);
		return basePrice - quantityDiscount + shipping;
	}
}
