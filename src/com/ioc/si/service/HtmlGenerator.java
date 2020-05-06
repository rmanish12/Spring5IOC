package com.ioc.si.service;

public class HtmlGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generate HTML report with: " + recordsPerPage + " page");
	}
	
}
