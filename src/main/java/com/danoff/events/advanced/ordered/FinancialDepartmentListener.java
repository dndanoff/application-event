package com.danoff.events.advanced.ordered;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class FinancialDepartmentListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FinancialDepartmentListener.class);
	
	@EventListener
	@Order(2)
	public void handle(EmployeeCreated event) throws InterruptedException {
		logger.info("FinancialDepartmentChainedListener triggered.");
		logger.info("Documents being created.");
		Thread.sleep(1000L);
		logger.info("Documents created.");
	}
}