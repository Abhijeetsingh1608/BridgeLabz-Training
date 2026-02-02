package com.collectors;

public class WordFrequencyCounter {
		public static void main(String[] args) {
		String paragraph = "Java is a programming language. Java is widely used in enterprise applications. Programming in Java is fun.";

		java.util.Map<String, Long> wordFrequency = java.util.Arrays.stream(paragraph.toLowerCase().split("\\W+"))
				.filter(word -> !word.isEmpty())
				.collect(java.util.stream.Collectors.groupingBy(word -> word, java.util.stream.Collectors.counting()));

		System.out.println("Word Frequency:");
		wordFrequency.forEach((word, count) -> System.out.println(word + ": " + count));
	}

}
