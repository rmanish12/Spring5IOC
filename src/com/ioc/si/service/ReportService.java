package com.ioc.si.service;

public class ReportService {

	private int recordsPerPage;
	private ReportGenerator master;

	public ReportGenerator getMaster() {
		return master;
	}

	public void setMaster(ReportGenerator master) {
		this.master = master;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}
	
	public void display() {
		System.out.println("Report service with per page record: " + recordsPerPage);
	}
	
	public void generateReport() {
		System.out.println(master.generateReport(recordsPerPage));
	}
	
}
