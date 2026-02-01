package com.streamapi.streamapi;
    import java.time.LocalDate;
	import java.util.Arrays;
	import java.util.List;
	public class FilteringMemberships {
	static class Member {
		String name;
		LocalDate expiryDate;

		Member(String name, LocalDate expiryDate) {
			this.name = name;
			this.expiryDate = expiryDate;
		}

		public String getName() {
			return name;
		}

		public LocalDate getExpiryDate() {
			return expiryDate;
		}
	}

	public static void main(String[] args) {
		List<Member> members = Arrays.asList(
			new Member("Alice", LocalDate.now().plusDays(10)),
			new Member("Bob", LocalDate.now().plusDays(40)),
			new Member("Charlie", LocalDate.now().plusDays(20)),
			new Member("David", LocalDate.now().plusDays(60))
		);

		LocalDate today = LocalDate.now();
		LocalDate thresholdDate = today.plusDays(30);

		System.out.println("Members with memberships expiring within the next 30 days:");
		members.stream()
			.filter(member -> member.getExpiryDate().isBefore(thresholdDate))
			.forEach(member -> System.out.println(member.getName() + " - Expiry Date: " + member.getExpiryDate()));
	}

}
