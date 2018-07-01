package org.mitz.changeReferenceToValue;

public class Program {

	public static void main(String[] args) {
		Currency usd = new Currency("USD");
		System.out.println(usd.equals(new Currency("USD")));
	}
}
