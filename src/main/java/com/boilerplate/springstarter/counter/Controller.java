/**
 * 
 */
package com.boilerplate.springstarter.counter;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		Optional<CounterMirror> mirror = counterRepository.findById((long)1);
		return counterRepository.updateCounter(mirror.get().getCount());
	}
	
	@PutMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public Integer incrementCounterSecond() {
		logger.info("getCounterValue - accessing...");
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("entitymanager");
		EntityManager entitymanager = emfactory.createEntityManager( );
		EntityManager em = entitymanager.getTransaction().begin();
		
		CounterMirror mirror = em.find(CounterMirror.class, (long)1, LockModeType.PESSIMISTIC_WRITE);
		em.setProperty("id", mirror.getCount());
		return 1;
	}
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public Integer incrementCounterAtOnce() {
		logger.info("getCounterValue - accessing...");
		return counterRepository.updateCounterAtOnce();
	}

}
