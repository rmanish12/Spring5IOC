package com.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ReportGenerateService {

	@Value("675")
	private int recordsPerPage;
	
	@Autowired
	@Qualifier("pdfGenerator")
	private ReportGenerator master;

	public ReportGenerateService() {
		System.out.println("default constructor");
	}

	public ReportGenerateService(int recordsPerPage, ReportGenerator master) {
		System.out.println("parameterized constructor");
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
