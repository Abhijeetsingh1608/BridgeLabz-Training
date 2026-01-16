package com.zipzipmart;

 class ZipZipMartMain {
	  public static void main(String[] args) {

	        Transaction[] transactions = {
	            new Transaction("2026-01-12", 500),
	            new Transaction("2026-01-10", 300),
	            new Transaction("2026-01-12", 500),
	            new Transaction("2026-01-11", 700)
	        };

	        System.out.println("Before Sorting:");
	        display(transactions);

	        MergeSorter.mergeSort(transactions, 0, transactions.length - 1);

	        System.out.println("\nAfter Sorting by Date:");
	        display(transactions);
	    }

	    static void display(Transaction[] transactions) {
	        for (Transaction t : transactions) {
	            System.out.println("Date: " + t.date + 
	                               ", Amount: " + t.amount);
	        }
	    }
	 

}
