package com.FirstProject1.Program1.controller;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	Logger logger = LoggerFactory.getLogger(MessageController.class)
	
	@GetMapping("/message")
	public String getMessage() {
		logger.info("[getMessage] info message");
		logger.warn("[getMessage] warn message");
		logger.error("[getMessage] error message");
		logger.debug("[getMessage] debug message");
		logger.trace("[getMessage] trace message");
		System.out.println(10/0);
		
		return "This is our Project";
	}
}
