package org.mitz.introduceForeignMethod;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Date previousEnd = new Date();
		nextDay(previousEnd);
	}

	private static void nextDay(Date previousEnd) {
		Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
	}

	
}
