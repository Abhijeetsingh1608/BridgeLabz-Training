package com.collectors;
public class StudentResult {
		interface Student {
		String getName();
		String getGradeLevel();
	}

	static class SchoolStudent implements Student {
		private String name;
		private String gradeLevel;

		public SchoolStudent(String name, String gradeLevel) {
			this.name = name;
			this.gradeLevel = gradeLevel;
		}

		public String getName() {
			return name;
		}

		public String getGradeLevel() {
			return gradeLevel;
		}
	}

	public static void main(String[] args) {
		java.util.List<SchoolStudent> students = java.util.Arrays.asList(
				new SchoolStudent("Abhijeet", "10th"),
				new SchoolStudent("Bob", "11th"),
				new SchoolStudent("Charlie", "10th"),
				new SchoolStudent("David", "12th"),
				new SchoolStudent("Eve", "11th")
		);

		java.util.Map<String, java.util.List<String>> studentsByGrade = students.stream()
				.collect(java.util.stream.Collectors.groupingBy(
						SchoolStudent::getGradeLevel,
						java.util.stream.Collectors.mapping(SchoolStudent::getName, java.util.stream.Collectors.toList())
				));

		System.out.println("Students grouped by grade level:");
		studentsByGrade.forEach((grade, names) -> {
			System.out.println(grade + ": " + names);
		});
	}

}
