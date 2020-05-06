package com.ioc.ci.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.ci.service.ReportService;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("CIConfig.xml");
		
//		ReportService reportService = (ReportService) context.getBean("reportService");
		ReportService reportService = context.getBean("reportService", ReportService.class);
		ReportService reportService1 = context.getBean("reportService1", ReportService.class);
		ReportService reportService2 = context.getBean("reportService2", ReportService.class);
		ReportService reportService3 = context.getBean("reportService3", ReportService.class);
		ReportService reportService4 = context.getBean("reportService4", ReportService.class);
		
		reportService.display();
		reportService1.displayPage();
		reportService2.displayTotal();
		reportService3.displayTotal();
		reportService4.generateReport();
		
		context.close();
	}
	
}