  package com.streamapi.streamapi;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.stream.Collectors;
	public class TrendingMovies {
	interface Movie {
		String getTitle();
		double getRating();
		int getReleaseYear();
	}

	static class Film implements Movie {
		private String title;
		private double rating;
		private int releaseYear;

		public Film(String title, double rating, int releaseYear) {
			this.title = title;
			this.rating = rating;
			this.releaseYear = releaseYear;
		}

		public String getTitle() { return title; }
		public double getRating() { return rating; }
		public int getReleaseYear() { return releaseYear; }
	}

	public static void main(String[] args) {
		List<Film> movies = Arrays.asList(
			new Film("Movie A", 8.5, 2020),
			new Film("Movie B", 9.0, 2021),
			new Film("Movie C", 7.5, 2019),
			new Film("Movie D", 8.8, 2022),
			new Film("Movie E", 9.2, 2021),
			new Film("Movie F", 8.0, 2020),
			new Film("Movie G", 9.5, 2022)
		);

		List<Film> topMovies = movies.stream()
			.sorted(Comparator.comparingDouble(Movie::getRating).reversed()
			          .thenComparing(Movie::getReleaseYear).reversed())
			.limit(5)
			.collect(Collectors.toList());

		System.out.println("Top 5 Trending Movies:");
		topMovies.forEach(m -> System.out.println(m.getTitle() + " - Rating: " + m.getRating() + ", Year: " + m.getReleaseYear()));
	}

}
