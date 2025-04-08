package com.example.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcomecontroller {

	private Logger logger=LoggerFactory.getLogger(Welcomecontroller.class);
	
	@GetMapping("/welcome")
	public String welcomemsg() {
		logger.info("welcome start");
		String msg = "welcome to me..";
		logger.info("welcome ended");
		return msg;
	}

	@GetMapping("/greet")
	public String greetmsg() {
		logger.info("greet start");
		String greet = "hiii";
		logger.info("greet ended");
		return greet;
	}
}
