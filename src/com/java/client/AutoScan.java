package com.java.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.java.config.AutoScanConfig;
import com.java.service.ReportGenerateService;

public class AutoScan {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AutoScanConfig.class);
		
		ReportGenerateService reportService = context.getBean("reportGenerateService", ReportGenerateService.class);
		
		reportService.generateReport();
		
		context.close();
		
	}

}
