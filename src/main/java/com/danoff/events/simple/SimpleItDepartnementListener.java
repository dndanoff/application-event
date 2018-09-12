package com.danoff.events.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleItDepartnementListener {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleItDepartnementListener.class);
	
	@EventListener
	public void handle(EmployeeCreated event) throws InterruptedException {
		logger.info("ItDepartnementListener triggered.");
		logger.info("System account will be created.");
		Thread.sleep(1000L);
		logger.info("Account created.");
	}
}
