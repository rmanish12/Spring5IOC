package com.java.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.java.config.AppConfig;
import com.java.service.ReportService;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService reportService1 = context.getBean("reportService1", ReportService.class);
		ReportService reportService2 = context.getBean("reportService2", ReportService.class);
		
		reportService1.generateReport();
		
		System.out.println("**********************");
		
		reportService2.generateReport();
		
		context.close();
	}

}
