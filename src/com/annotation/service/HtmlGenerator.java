package com.annotation.service;

public class HtmlGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated Html report with " + recordsPerPage + " records");
	}

}
