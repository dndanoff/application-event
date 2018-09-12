package com.danoff.events.advanced.conditional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component

public class ConditionalItDepartnementListener {
	
	private static final Logger logger = LoggerFactory.getLogger(ConditionalItDepartnementListener.class);
	
	@EventListener(condition = "#event.employeeId != null && #event.employeeId > 0")
	public void handle(EmployeeCreated event) throws InterruptedException {
		logger.info("ItDepartnementListener triggered.");
		logger.info("System account will be created.");
		Thread.sleep(1000L);
		logger.info("Account created.");
	}
}