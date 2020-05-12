package com.aop.service;

import org.springframework.stereotype.Component;

@Component
public class HtmlGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated HTML report with  " + recordsPerPage + " records");
	}

}
