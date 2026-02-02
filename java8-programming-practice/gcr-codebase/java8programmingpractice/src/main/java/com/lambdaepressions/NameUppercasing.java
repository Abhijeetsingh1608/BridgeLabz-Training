package com.lambdaepressions;

public class NameUppercasing {
		interface Employee {
		String getName();
	}

	static class Staff implements Employee {
		private String name;

		public Staff(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		java.util.List<Staff> employees = java.util.Arrays.asList(
				new Staff("Alice"),
				new Staff("Bob"),
				new Staff("Charlie")
		);

		System.out.println("Employee Names in Uppercase:");
		employees.stream()
				.map(Staff::getName)
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}

}
