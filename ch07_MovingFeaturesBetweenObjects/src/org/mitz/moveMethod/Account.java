package org.mitz.moveMethod;

public class Account {

	private AccountType _type;
	private int _daysOverdrawn;

	double bankCharge() {
		double result = 4.5;
		if (_daysOverdrawn > 0)
			result += _type.overdraftCharge(_daysOverdrawn);
		return result;
	}
}
