package com.streamapi.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceChainAnalysis {

	interface Claim {
		String getType();
		double getAmount();
	}

	static class InsuranceClaim implements Claim {
		private String type;
		private double amount;

		public InsuranceClaim(String type, double amount) {
			this.type = type;
			this.amount = amount;
		}

		public String getType() {
			return type;
		}

		public double getAmount() {
			return amount;
		}
	}

	public static void main(String[] args) {

		List<Claim> claims = Arrays.asList(
			new InsuranceClaim("Health", 50000),
			new InsuranceClaim("Vehicle", 120000),
			new InsuranceClaim("Health", 30000),
			new InsuranceClaim("Life", 200000),
			new InsuranceClaim("Vehicle", 40000)
		);

		// Find average claim amount for each claim type
		Map<String, Double> averageClaimByType =
			claims.stream()
			      .collect(Collectors.groupingBy(
			          Claim::getType,
			          Collectors.averagingDouble(Claim::getAmount)
			      ));

		// Print result
		averageClaimByType.forEach((type, avgAmount) ->
			System.out.println(type + " -> Average Claim Amount: " + avgAmount)
		);
	}
}
