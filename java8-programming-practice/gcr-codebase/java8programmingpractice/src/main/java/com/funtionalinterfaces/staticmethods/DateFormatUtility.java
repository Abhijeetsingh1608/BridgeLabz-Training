package com.funtionalinterfaces.staticmethods;

public class DateFormatUtility {
		interface DateFormatter {
		static String formatDate(java.util.Date date, String pattern) {
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern);
			return sdf.format(date);
		}
	}

	public static void main(String[] args) {
		java.util.Date today = new java.util.Date();

		String format1 = DateFormatter.formatDate(today, "yyyy-MM-dd");
		String format2 = DateFormatter.formatDate(today, "dd/MM/yyyy");
		String format3 = DateFormatter.formatDate(today, "MMMM dd, yyyy");

		System.out.println("Formatted Dates:");
		System.out.println("Format 1: " + format1);
		System.out.println("Format 2: " + format2);
		System.out.println("Format 3: " + format3);
	}

}
