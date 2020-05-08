package com.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class ReportService {

	@Value("100") // annotation for initializing primitive values
	private int recordsPerPage;
	
	@Autowired // annotation for autowiring on property
	@Qualifier("htmlGenerator") // annotation to choose bean using bean id
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
	
	public ReportService(ReportGenerator master) {
		System.out.println("parameterized constructor");
		this.master = master;
	}
	
	public ReportService() {
		System.out.println("default constructor");
	}
	
	public void display() {
		System.out.println(master.generateReport(recordsPerPage));
	}
}
