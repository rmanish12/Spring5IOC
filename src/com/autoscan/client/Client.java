package com.autoscan.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autoscan.service.ReportService;

public class Client {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("AutoScanConfig.xml");
		
		ReportService reportService = context.getBean("reportService", ReportService.class);
		reportService.display();
		
		context.close();
	}

}
