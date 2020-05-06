package com.ioc.ci.service;

public class HtmlGenerator implements ReportGenerator{

	public String generateReport(int recordsPerPage) {
		return ("Generated html report with: " + recordsPerPage + " records");
	}
	
}
