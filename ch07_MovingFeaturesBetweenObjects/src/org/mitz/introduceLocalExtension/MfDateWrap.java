package org.mitz.introduceLocalExtension;

import java.util.Date;

public class MfDateWrap {

	private Date _original;

	public MfDateWrap(Date arg) {
		_original = arg;
	}

	public MfDateWrap(String arg) {
		_original = new Date(arg);
	}
	
	public Date nextDay() {
		return new Date(_original.getYear(), _original.getMonth(), _original.getDate() + 1);
	}
}
