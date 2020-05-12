package com.aop.service;

import java.text.DateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//	@After("execution(* com.aop.service.ReportService.generateReport(..))")
//	public void logAfterAdvice(JoinPoint joinPoint) {
//		
//		// log joinpoint signature
//		System.out.println("In after advice, Joinpoint signature: " + joinPoint.getSignature());
//		
//		long time = System.currentTimeMillis();
//		
//		// log time
//		System.out.println("Report generated at time: " + DateFormat.getDateTimeInstance().format(time));
//		
//	}
//	
//	@Before("execution(* com.aop.service.ReportService.generateReport(..))")
//	public void logBeforeAdvice(JoinPoint joinPoint) {
//		System.out.println("In before advice, Joinpoint signature: " + joinPoint.getSignature());
//	}
//	
//	// executes when joinpoint runs successfully
//	@AfterReturning("execution(* com.aop.service.ReportService.generateReport(..))")
//	public void logAfterSuccess(JoinPoint joinPoint) {
//		System.out.println("In afterReturning advice, report generated successfully");
//	}
//	
//	// executes after joinpoint throws exception
//	@AfterThrowing("execution(* com.aop.service.ReportService.generateReport(..))")
//	public void logAfterException(JoinPoint joinPoint) {
//		System.out.println("In afterThrowing advice, report generation throws error");
//	}
	
	// around
	@Around("execution(* com.aop.service.ReportService.generateReport(..))")
	public Object logAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Before: In around advice");
		
		long start = System.currentTimeMillis();
		
		Object returnValue = null;
		
		try {
			returnValue = jp.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("After: In around advice");
		
		System.out.println("Report generation took: " + (end-start) + " milliseconds");
		
		// modifying the return value from Joinpoint
		returnValue = "Value returned from advice: " + returnValue;
		
		System.out.println(returnValue);
		
		return returnValue;
	}
	
}
