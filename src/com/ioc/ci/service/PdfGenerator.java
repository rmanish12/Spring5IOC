package com.ioc.ci.service;

public class PdfGenerator implements ReportGenerator {

	public String generateReport(int recordsPerPage) {
		return ("Generated pdf report with: " + recordsPerPage + " records");
	}
	
}
