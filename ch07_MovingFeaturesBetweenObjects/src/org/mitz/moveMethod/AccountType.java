package org.mitz.moveMethod;

public class AccountType {

	public boolean isPremium() {
		return false;
	}

	double overdraftCharge(Account account) {
		if (isPremium()) {
			double result = 10;
			if (account.getDaysOverdrawn() > 7)
				result += (account.getDaysOverdrawn() - 7) * 0.85;
			return result;
		} else
			return account.getDaysOverdrawn() * 1.75;
	}
}
