package com.danoff.events.advanced.conditional;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.danoff.events.ApplicationEventApplication;

@Component
public class ConditionalEventAppRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(ConditionalEventAppRunner.class);

	private static final String MODE = "conditional";
	
	private final ApplicationEventPublisher publisher;

	@Autowired
	public ConditionalEventAppRunner(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> modeArgs = args.getOptionValues(ApplicationEventApplication.MODE_PARAM);
		if(modeArgs == null || !modeArgs.contains(MODE)) {
			return;
		}
		
		logger.info("Created new employee with ID");
		publisher.publishEvent(new EmployeeCreated(1L));
		
		logger.info("Created new employee with null ID");
		publisher.publishEvent(new EmployeeCreated(null));
		
		logger.info("ConditionalEventAppRunner finished execution");
	}

}