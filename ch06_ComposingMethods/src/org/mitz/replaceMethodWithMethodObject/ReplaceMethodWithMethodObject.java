package org.mitz.replaceMethodWithMethodObject;

public class ReplaceMethodWithMethodObject {

	int gamma(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}

	public int delta() {
		return 0;
	}
}
