package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.service.HtmlGenerator;
import com.java.service.PdfGenerator;
import com.java.service.ReportGenerator;
import com.java.service.ReportService;

@Configuration
public class AppConfig {

	@Bean // bean definition for HtmlGenerator
	public ReportGenerator htmlGenerator() {
		return new HtmlGenerator();
	}
	
	@Bean // bean definition for PdfGenerator
	public ReportGenerator pdfGenerator() {
		return new PdfGenerator();
	}
	
	@Bean
	public ReportService reportService1() {
		ReportService reportService = new ReportService(234, pdfGenerator());
		return reportService;
	}
	
	@Bean
	public ReportService reportService2() {
		ReportService reportService = new ReportService();
		reportService.setMaster(htmlGenerator());
		reportService.setRecordsPerPage(456);
		
		return reportService;
	}
}
