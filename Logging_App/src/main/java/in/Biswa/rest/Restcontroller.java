package in.Biswa.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
	
	
	public Logger logger=LoggerFactory.getLogger(Restcontroller.class);
	@GetMapping("/welcome")
	public String getWelcomemsg() {
		logger.info("info logger  1start");
		logger.debug("debug logger start");
	try {
		int i=10/0;
	}catch(Exception e){
		logger.error("logger error start "+e.getMessage());
	}
		String msg="welcome";
		logger.info("info logger start");
		return msg;
	}

}
