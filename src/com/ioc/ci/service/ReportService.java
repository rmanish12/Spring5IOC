package com.ioc.ci.service;

public class ReportService {
	
	private int recordsPerPage;
	private int totalRecords;
	
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
}
