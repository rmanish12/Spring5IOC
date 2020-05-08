package com.annotation.service;

public class PdfGenerator implements ReportGenerator {

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated Pdf report with " + recordsPerPage + " records");
	}

}
