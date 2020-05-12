package com.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	@Value("20")
	private int recordsPerPage;
	
	@Autowired
	@Qualifier("htmlGenerator")
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
	
	public String generateReport() throws ArithmeticException {
		System.out.println("Inside report service generator method");
		
		if(recordsPerPage<=0) {
			throw new ArithmeticException("No records to generate");
		}
		
		String result = master.generateReport(recordsPerPage);
		System.out.println("Value returned by report: " + result);
		
		return result;
	}
	
}
