package com.collectors;
    import java.util.Arrays;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collectors;
	public class OrderRevenueSummary {
	 static class Order {
		String customerName;
		double orderTotal;

		Order(String customerName, double orderTotal) {
			this.customerName = customerName;
			this.orderTotal = orderTotal;
		}

		public String getCustomerName() {
			return customerName;
		}

		public double getOrderTotal() {
			return orderTotal;
		}
	}

	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
				new Order("Alice", 250.0),
				new Order("Bob", 150.0),
				new Order("Alice", 300.0),
				new Order("Bob", 200.0),
				new Order("Charlie", 400.0)
		);

		Map<String, Double> revenueByCustomer = orders.stream()
				.collect(Collectors.groupingBy(
						Order::getCustomerName,
						Collectors.summingDouble(Order::getOrderTotal)
				));

		revenueByCustomer.forEach((customer, total) ->
				System.out.println(customer + ": $" + total));
	}

}
