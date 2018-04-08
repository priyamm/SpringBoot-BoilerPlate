/**
 * 
 */
package com.boilerplate.springstarter.counter;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author priyamgupta
 *
 */
@RestController
@RequestMapping("increment")
public class Controller {
	public static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private CounterRepository counterRepository;
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public Optional<CounterMirror> getCounterValue() {
		logger.info("getCounterValue - accessing...");
		return counterRepository.findById((long)1);
	}
	
	@PutMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public Integer incrementCounter() {
		logger.info("getCounterValue - accessing...");
		return counterRepository.updateCounter();
	}

}
