package com.funtionalinterfaces.functionalinterfaces;

public class StringLengthChecker {
		interface StringLength {
		int getLength(String str);
	}

	static class LengthChecker implements StringLength {
		private static final int LIMIT = 100;

		@Override
		public int getLength(String str) {
			return str.length();
		}
	}

	public static void main(String[] args) {
		StringLength lengthChecker = new LengthChecker();

		String message = "This is a sample message to check the length of the string and see if it exceeds the character limit set for messages in this application.";

		int length = lengthChecker.getLength(message);
		System.out.println("Message Length: " + length);
		if (length > 100) {
			System.out.println("Alert! Message exceeds character limit.");
		} else {
			System.out.println("Message is within the character limit.");
		}
	}

}
