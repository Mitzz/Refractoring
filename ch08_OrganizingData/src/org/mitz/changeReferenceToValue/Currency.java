package org.mitz.changeReferenceToValue;

public class Currency {
	private String _code;

	public String getCode() {
		return _code;
	}

	private Currency(String code) {
		_code = code;
	}

	public static Currency get(String string) {
		return null;
	}

}
