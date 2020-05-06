package com.ioc.si.service;

public class PdfGenerator implements ReportGenerator{

	@Override
	public String generateReport(int recordsPerPage) {
		return ("Generate PDF report with: \" + recordsPerPage + \" page");
	}

}
