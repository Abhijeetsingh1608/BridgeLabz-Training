package com.lambdaepressions;

public class InvoiceObjectCreation {
		interface Transaction {
		String getTransactionId();
	}

	static class Invoice implements Transaction {
		private String transactionId;

		public Invoice(String transactionId) {
			this.transactionId = transactionId;
		}

		public String getTransactionId() {
			return transactionId;
		}
	}

	public static void main(String[] args) {
		java.util.List<String> transactionIds = java.util.Arrays.asList("T1001", "T1002", "T1003");

		System.out.println("Invoices Created:");
		transactionIds.stream()
				.map(Invoice::new)
				.forEach(invoice -> System.out.println("Invoice for Transaction ID: " + invoice.getTransactionId()));
	}

}
