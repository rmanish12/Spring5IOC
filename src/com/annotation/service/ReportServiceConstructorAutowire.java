package com.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ReportServiceConstructorAutowire {

	private int recordsPerPage;
	private ReportGenerator master;
	
	@Autowired
	public ReportServiceConstructorAutowire(int recordsPerPage, ReportGenerator master) {
		System.out.println("paramterized constructor");
		this.recordsPerPage = recordsPerPage;
		this.master = master;
	}
	
	public void display() {
		System.out.println(master.generateReport(recordsPerPage));
	}
	
}
