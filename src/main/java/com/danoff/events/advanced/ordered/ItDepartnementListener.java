package com.danoff.events.advanced.ordered;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ItDepartnementListener {
	
	private static final Logger logger = LoggerFactory.getLogger(ItDepartnementListener.class);
	
	@EventListener
	@Order(1)
	public void handle(EmployeeCreated event) throws InterruptedException {
		logger.info("ItDepartnementListener triggered.");
		logger.info("System account will be created.");
		Thread.sleep(1000L);
		logger.info("Account created.");
	}
}
