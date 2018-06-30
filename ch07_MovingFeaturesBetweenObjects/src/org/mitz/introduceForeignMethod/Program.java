package org.mitz.introduceForeignMethod;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Date previousEnd = new Date();
		Date newStart = nextDay(previousEnd);
	}

	private static Date nextDay(Date previousEnd) {
		return new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
	}

	
}
