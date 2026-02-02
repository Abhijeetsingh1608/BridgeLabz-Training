package com.funtionalinterfaces.defaultmethods;

public class DataExportFeature {
	interface DataExporter {
		void exportToCSV(String data);
		void exportToPDF(String data);

		default void exportToJSON(String data) {
			System.out.println("Exporting data to JSON: " + data);
		}
	}

	static class ReportGenerator implements DataExporter {
		public void exportToCSV(String data) {
			System.out.println("Exporting data to CSV: " + data);
		}

		public void exportToPDF(String data) {
			System.out.println("Exporting data to PDF: " + data);
		}
	}

	public static void main(String[] args) {
		DataExporter report = new ReportGenerator();
		String sampleData = "Sample Report Data";

		report.exportToCSV(sampleData);
		report.exportToPDF(sampleData);
		report.exportToJSON(sampleData);
	}

}
