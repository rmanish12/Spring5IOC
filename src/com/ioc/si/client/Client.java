package com.ioc.si.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.si.service.ReportService;

public class Client {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SIConfig.xml");
		
		ReportService reportService = context.getBean("reportService", ReportService.class);
		ReportService reportService1 = context.getBean("reportService1", ReportService.class);
		
		reportService.display();
		reportService1.generateReport();
		
		context.close();
		
	}

}
