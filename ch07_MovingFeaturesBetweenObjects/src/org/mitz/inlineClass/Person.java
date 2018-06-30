package org.mitz.inlineClass;

public class Person {
	private String _name;
	private TelephoneNumber _officeTelephone = new TelephoneNumber();

	public String getName() {
		return _name;
	}

	public String getTelephoneNumber() {
		return ("(" + _officeTelephone.getAreaCode() + ") " + _officeTelephone.getNumber());
	}

	String getOfficeAreaCode() {
		return _officeTelephone.getAreaCode();
	}

	void setOfficeAreaCode(String arg) {
		_officeTelephone.setAreaCode(arg);
	}

	String getOfficeNumber() {
		return _officeTelephone.getNumber();
	}

	void setOfficeNumber(String arg) {
		_officeTelephone.setNumber(arg);
	}

	String getAreaCode() {
		return _officeTelephone.getAreaCode();
	}

	void setAreaCode(String arg) {
		_officeTelephone.setAreaCode(arg);
	}

	String getNumber() {
		return _officeTelephone.getNumber();
	}

	void setNumber(String arg) {
		_officeTelephone.setNumber(arg);
	}
}
