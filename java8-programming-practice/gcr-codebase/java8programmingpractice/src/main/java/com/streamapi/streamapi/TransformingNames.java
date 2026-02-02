package com.streamapi.streamapi;

public class TransformingNames {
		public static void main(String[] args) {
		java.util.List<String> customerNames = java.util.Arrays.asList(
				"John Doe",
				"Jane Smith",
				"Alice Johnson",
				"Bob Brown"
		);

		System.out.println("Customer Names in Uppercase and Sorted:");
		customerNames.stream()
				.map(String::toUpperCase)
				.sorted()
				.forEach(System.out::println);
	}
	

}
