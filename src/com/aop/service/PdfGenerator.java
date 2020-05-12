package com.aop.service;

public class PdfGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated PDF report with " + recordsPerPage + " page");
	}

}
