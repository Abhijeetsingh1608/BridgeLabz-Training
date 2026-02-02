package com.streamapi.foreachmethod;

public class LoggingTransactions {
		public static void main(String[] args) {
		java.util.List<String> transactionIds = java.util.Arrays.asList("TXN1001", "TXN1002", "TXN1003");

		System.out.println("Logging Transactions:");
		transactionIds.forEach(id -> System.out.println(java.time.LocalDateTime.now() + " - Transaction: " + id));
	}

}
