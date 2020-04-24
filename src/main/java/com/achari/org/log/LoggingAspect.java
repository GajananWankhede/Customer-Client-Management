package com.achari.org.log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggingAspect {
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.achari.org.controller.CustomerController.getAllCustomer())")
	public void logBefore() {
		LOGGER.info("getAllCustomer method called from LoggingAspect");
	}
	
	@AfterReturning("execution(public * com.achari.org.controller.CustomerController.*(..))")
	public void logAfter() {
		LOGGER.info("getAllCustomer method Executed from LoggingA");
	}
	
	@AfterThrowing("execution(public * com.achari.org.controller.CustomerController.getAllCustomer())")
	public void logException() {
		LOGGER.info("Issue");
	}

}
