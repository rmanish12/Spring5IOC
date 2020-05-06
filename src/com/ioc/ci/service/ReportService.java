package com.ioc.ci.service;

import java.util.List;

public class ReportService {
	
	private int recordsPerPage;
	private int totalRecords;
	private List<String> names;
	
	private ReportGenerator master;
	
	//default constructor
	public ReportService() {
		
	}
	
	// parameterized constructor for constructor injection
	public ReportService(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}
	
	// parameterized constructor with multiple values
	public ReportService(int recordsPerPage, int totalRecords) {
		this.recordsPerPage = recordsPerPage;
		this.totalRecords = totalRecords;
	}
	
	// parameterized constructor with non-primitive arguments
	public ReportService(ReportGenerator master, int recordsPerPage) {
		this.master = master;
		this.recordsPerPage = recordsPerPage;
	}
	
	//
	public ReportService(int recordsPerPage, int totalRecords, List<String> names) {
		this.recordsPerPage = recordsPerPage;
		this.totalRecords = totalRecords;
		this.names = names;
	}
	
	public void display() {
		System.out.println("Report generation service");
	}
	
	public void displayPage() {
		System.out.println("Report generation service with page: " + recordsPerPage);
	}
	
	public void displayTotal() {
		System.out.println("Report generation service with per page record: " + recordsPerPage + " and total records: " + totalRecords);
	}
	
	public void generateReport() {
		System.out.println(master.generateReport(recordsPerPage));
	}
	
	public void displayValues() {
		System.out.println("Report generation service with per page record: " + recordsPerPage + " and total records: " + totalRecords);
		for(String s: names) {
			System.out.println(s);
		}
	}
}
