package org.mitz.selfEncapsulateField;

public class IntRange {

	private int _low, _high;

	boolean includes(int arg) {
		return arg >= getLow() && arg <= getHigh();
	}

	void grow(int factor) {
		setHigh(getHigh() * factor);
	}

	IntRange(int low, int high) {
		setLow(low);
		setHigh(high);
	}

	int getLow() {
		return _low;
	}

	int getHigh() {
		return _high;
	}

	void setLow(int arg) {
		_low = arg;
	}

	void setHigh(int arg) {
		_high = arg;
	}
}
