package com.streamapi.foreachmethod;

public class EventAttendeeMsg {
		public static void main(String[] args) {
		java.util.List<String> attendees = java.util.Arrays.asList("John", "Jane", "Doe");

		System.out.println("Welcome Messages for Attendees:");
		attendees.stream()
				.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
	}

}
