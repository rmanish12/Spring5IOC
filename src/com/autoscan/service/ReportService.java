package com.autoscan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReportService {

	@Value("250")
	private int recordsPerPage;
	
	@Autowired
	@Qualifier("htmlGenerator")
	private ReportGenerator master;

	public ReportService() {
		System.out.println("default constructor");
	}

	public ReportService(int recordsPerPage, ReportGenerator master) {
		System.out.println("parameterized constructor");
		this.recordsPerPage = recordsPerPage;
		this.master = master;
	}
	
	public void display() {
		System.out.println(master.generateReport(recordsPerPage));
	}
	
}
