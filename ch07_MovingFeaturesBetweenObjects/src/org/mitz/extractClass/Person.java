package org.mitz.extractClass;

public class Person {
	private String _name;
	private String _officeNumber;
	private TelephoneNumber _officeTelephone = new TelephoneNumber();
	
	public String getName() {
		return _name;
	}

	public String getTelephoneNumber() {
		return ("(" + _officeTelephone.getAreaCode() + ") " + _officeNumber);
	}

	String getOfficeAreaCode() {
		return _officeTelephone.getAreaCode();
	}

	void setOfficeAreaCode(String arg) {
		_officeTelephone.setAreaCode(arg);
	}

	String getOfficeNumber() {
		return _officeNumber;
	}

	void setOfficeNumber(String arg) {
		_officeNumber = arg;
	}
}
