package org.mitz.introducingexplainingvariable;

public class IntroduceExplainingVariable {

	private int _quantity;
	private int _itemPrice;

	double price() {
		// price is base price - quantity discount + shipping
		final double basePrice = _quantity * _itemPrice;
		return basePrice - Math.max(0, _quantity - 500) * _itemPrice * 0.05
				+ Math.min(basePrice * 0.1, 100.0);
	}
}
