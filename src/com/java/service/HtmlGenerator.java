package com.java.service;

import org.springframework.stereotype.Component;

@Component
public class HtmlGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated html report with " + recordsPerPage + " records");
	}

}
