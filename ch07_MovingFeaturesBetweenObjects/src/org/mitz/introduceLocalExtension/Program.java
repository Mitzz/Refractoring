package org.mitz.introduceLocalExtension;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Date previousEnd = new Date();
		Date newStart = new MfDateSub(previousEnd).nextDay();
	}
}
