package com.annotation.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.service.ReportService;
import com.annotation.service.ReportServiceConstructorAutowire;
import com.annotation.service.ReportServiceSetterAutowire;

public class Client {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		ReportService reportService = context.getBean("reportService", ReportService.class);
//		ReportServiceConstructorAutowire reportService1 = context.getBean("reportService1", ReportServiceConstructorAutowire.class);
//		ReportServiceSetterAutowire reportService2 = context.getBean("reportService2", ReportServiceSetterAutowire.class);
		
		reportService.display();
		
		System.out.println("***************");
		
//		reportService1.display();
		
		System.out.println("***************");
		
//		reportService2.display();
		
		context.close();
	}

}
