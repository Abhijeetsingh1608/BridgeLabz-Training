package com.collectors;
    import java.util.*;
	import java.util.stream.Collectors;
	public class LibraryBook {
	static class Book {
		String title;
		String genre;
		int pages;

		Book(String title, String genre, int pages) {
			this.title = title;
			this.genre = genre;
			this.pages = pages;
		}
	}

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("Book A", "Fiction", 300),
				new Book("Book B", "Fiction", 150),
				new Book("Book C", "Non-Fiction", 200),
				new Book("Book D", "Science", 400),
				new Book("Book E", "Science", 250)
		);

		Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				.collect(Collectors.groupingBy(
						book -> book.genre,
						Collectors.summarizingInt(book -> book.pages)
				));

		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages: " + stats.getSum());
			System.out.println("Average Pages: " + stats.getAverage());
			System.out.println("Maximum Pages: " + stats.getMax());
			System.out.println();
		});
	}

}
