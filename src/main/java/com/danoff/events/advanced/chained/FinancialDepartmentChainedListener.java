package com.danoff.events.advanced.chained;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FinancialDepartmentChainedListener {
	
	private static final Logger logger = LoggerFactory.getLogger(FinancialDepartmentChainedListener.class);
	
	@EventListener
	public void handle(AccountCreated event) throws InterruptedException {
		logger.info("FinancialDepartmentChainedListener triggered.");
		logger.info("Documents being created.");
		Thread.sleep(1000L);
		logger.info("Documents created.");
	}
}