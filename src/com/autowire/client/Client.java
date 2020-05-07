package com.autowire.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.service.ReportService;

public class Client {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("AutowireConfig.xml");
		
//		ReportService reportService = context.getBean("reportService", ReportService.class);
//		ReportService reportService1 = context.getBean("reportService1", ReportService.class);
		ReportService reportService2 = context.getBean("reportService2", ReportService.class);
		
//		reportService.display();
//		reportService1.display();
		reportService2.display();
		
		context.close();
	}
	
}