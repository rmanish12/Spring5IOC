package com.java.service;

import org.springframework.stereotype.Component;

@Component
public class PdfGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated pdf report with " + recordsPerPage + " records");
	}

}
