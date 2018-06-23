package org.mitz.inlinemethod;

public class InlineMethod {

	private int _numberOfLateDeliveries;

	int getRating() {
		return (_numberOfLateDeliveries > 5) ? 2 : 1;
	}

}
