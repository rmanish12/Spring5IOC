package com.scope.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scope.service.ReportService;

public class Client {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ScopeConfig.xml");
		
		// Singleton bean instances
		ReportService reportService1 = context.getBean("reportService", ReportService.class);
		ReportService reportService2 = context.getBean("reportService", ReportService.class);
		
		// Prototype bean instances
		ReportService reportService3 = context.getBean("reportService1", ReportService.class);
		ReportService reportService4 = context.getBean("reportService1", ReportService.class);
		
		System.out.println(reportService1.hashCode());
		System.out.println(reportService2.hashCode());
		
		if(reportService1 == reportService2) {
			System.out.println("Same instance");
		} else {
			System.out.println("Different instance");
		}
		
		System.out.println("***********************");
		System.out.println(reportService3.hashCode());
		System.out.println(reportService4.hashCode());
		
		if(reportService3 == reportService4) {
			System.out.println("Same instance");
		} else {
			System.out.println("Different instance");
		}
		
		context.close();
		
	}

}
