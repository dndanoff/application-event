package com.danoff.events.advanced.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GenericItDepartnementListener {
	
	private static final Logger logger = LoggerFactory.getLogger(GenericItDepartnementListener.class);
	
	@EventListener
	public void handle(EntityCreated<Employee> event) throws InterruptedException {
		logger.info("ItDepartnementListener triggered.");
		logger.info("System account will be created.");
		Thread.sleep(1000L);
		logger.info("Account created.");
	}
}
