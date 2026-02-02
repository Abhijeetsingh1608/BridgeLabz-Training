package com.streamapi.foreachmethod;

public class StockPriceLogger {
		public static void main(String[] args) {
		java.util.List<Double> stockPrices = java.util.Arrays.asList(150.25, 152.30, 149.80, 151.00, 153.45);

		System.out.println("Live Stock Price Updates:");
		stockPrices.stream()
				.forEach(price -> System.out.println("Stock Price: $" + price));
	}

}
