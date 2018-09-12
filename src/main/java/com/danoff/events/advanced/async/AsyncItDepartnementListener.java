package com.danoff.events.advanced.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncItDepartnementListener {
	
	private static final Logger logger = LoggerFactory.getLogger(AsyncItDepartnementListener.class);
	
	@EventListener
	@Async
	public void handle(EmployeeCreated event) throws InterruptedException {
		logger.info("ItDepartnementListener triggered.");
		logger.info("System account will be created.");
		Thread.sleep(1000L);
		logger.info("Account created.");
	}
}
