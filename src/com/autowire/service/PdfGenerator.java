package com.autowire.service;

public class PdfGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated PDF report with " + recordsPerPage + " records");
	}

}
