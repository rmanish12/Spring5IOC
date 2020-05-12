package com.aop.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.aop.config.AppConfig;
import com.aop.service.ReportService;

public class Client {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
		ReportService reportService = context.getBean("reportService", ReportService.class);
		
		try {
			reportService.generateReport();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		context.close();
	}
	
}