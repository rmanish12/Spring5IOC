package com.autoscan.service;

import org.springframework.stereotype.Component;

@Component
public class HtmlGenerator implements ReportGenerator {

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generated html report with " + recordsPerPage + " page");
	}

}
