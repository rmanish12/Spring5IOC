package com.java.service;

public class ReportService {
	
	private int recordsPerPage;
	private ReportGenerator master;
	
	public ReportService() {
		System.out.println("Default constructor");
	}

	public ReportService(int recordsPerPage, ReportGenerator master) {
		System.out.println("Parameterized constructor");
		this.recordsPerPage = recordsPerPage;
		this.master = master;
	}

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
	
	public void generateReport() {
		System.out.println(master.generateReport(recordsPerPage));
	}
}
