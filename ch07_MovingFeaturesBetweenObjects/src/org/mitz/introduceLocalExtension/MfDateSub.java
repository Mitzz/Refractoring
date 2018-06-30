package org.mitz.introduceLocalExtension;

import java.util.Date;

public class MfDateSub extends Date{
	
	public MfDateSub(Date arg) {
		super(arg.getTime());
	}
	
	public MfDateSub(String arg) {
		super(arg);
	}

	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}

}
