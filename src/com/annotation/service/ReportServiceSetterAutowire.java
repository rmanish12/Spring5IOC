package com.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ReportServiceSetterAutowire {

	private int recordsPerPage;
	private ReportGenerator master;
	
	public ReportServiceSetterAutowire() {
		System.out.println("default constructor");
	}

	public ReportServiceSetterAutowire(int recordsPerPage, ReportGenerator master) {
		System.out.println("parameterized constructor");
		this.recordsPerPage = recordsPerPage;
		this.master = master;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		System.out.println("set recordsPerPage property");
		this.recordsPerPage = recordsPerPage;
	}

	public ReportGenerator getMaster() {
		return master;
	}

	@Autowired
	public void setMaster(ReportGenerator master) {
		System.out.println("set master property");
		this.master = master;
	}
	
	public void display() {
		System.out.println(master.generateReport(recordsPerPage));
	}
	
}
