package com.danoff.events.advanced.chained;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component

public class ItDepartnementChainedListener {
	
	private static final Logger logger = LoggerFactory.getLogger(ItDepartnementChainedListener.class);
	
	@EventListener
	public AccountCreated handle(EmployeeCreated event) throws InterruptedException {
		logger.info("ItDepartnementListener triggered.");
		logger.info("System account will be created.");
		Thread.sleep(1000L);
		logger.info("Account created.");
		
		return new AccountCreated();
	}
}
