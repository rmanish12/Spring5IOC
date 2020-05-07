package com.autowire.service;

public class ReportService {

	private int recordsPerPage;
	private ReportGenerator master;
	
	public int getRecordsPerPage() {
		return recordsPerPage;
	}
	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}
	public ReportGenerator getMaster() {
		return master;
	}
	public void setMaster(ReportGenerator master) {
		this.master = master;
	}
	
	public void display() {
		System.out.println(master.generateReport(recordsPerPage));
	}
	
	public ReportService(int recordsPerPage, ReportGenerator master) {
		this.recordsPerPage = recordsPerPage;
		this.master = master;
	}
//	public ReportService() {
//		
//	}
}
